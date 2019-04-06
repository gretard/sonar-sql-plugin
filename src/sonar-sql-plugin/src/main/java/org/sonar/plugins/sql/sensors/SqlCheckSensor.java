package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.Severity;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.issue.NewExternalIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.rules.RuleType;
import org.sonar.api.utils.TempFolder;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.sensors.sqlcheck.SQLCheckIssuesReader;
import org.sonar.plugins.sql.sensors.sqlcheck.SQLCheckIssuesReader.SQLCheckIssue;

public class SqlCheckSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(SqlCheckSensor.class);

	private final String repositoryName = Constants.SQL_SQLCHECK_ENGINEID;

	private final SQLCheckIssuesReader reader = new SQLCheckIssuesReader();

	private final TempFolder tempFolder;

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey);

	}

	public SqlCheckSensor(final TempFolder tempFolder) {
		this.tempFolder = tempFolder;

	}

	@Override
	public void execute(SensorContext context) {
		final String externalTool = context.config().get(Constants.SQL_SQLCHECK_PATH)
				.orElse(Constants.SQL_SQLCHECK_PATH_DEFAULT).toLowerCase();
		try {
			if (!Files.exists(Paths.get(externalTool))) {
				LOGGER.info("Skip running external tool as executable not found {}", externalTool);
				return;
			}
			final long timeout = context.config().getLong(Constants.PLUGIN_SQL_SCA_TIMEOUT).orElse((long) 3600);

			final ExecutorService service = Executors.newWorkStealingPool();
			for (InputFile file : context.fileSystem()
					.inputFiles(context.fileSystem().predicates().hasLanguage(Constants.languageKey))) {
				service.submit(new Runnable() {

					@Override
					public void run() {
						try {
							execute(context, externalTool, file);
						} catch (Throwable e) {
							LOGGER.warn("Unexpected exception while analyzing file: " + file, e);
						}
					}
				});
			}

			service.shutdown();
			try {
				service.awaitTermination(timeout, TimeUnit.SECONDS);
				service.shutdownNow();
			} catch (Throwable e) {
				LOGGER.warn("Unexpected exception while waiting for executor service to finish.", e);
			}
		} catch (Throwable e) {
			LOGGER.warn("Unexpected error", e);
		}

	}

	private void execute(SensorContext context, final String externalTool, InputFile file)
			throws IOException, InterruptedException {
		final File tempResultsFile = tempFolder.newFile("temp", "results.xml");

		@SuppressWarnings("deprecation")
		final String[] args = new String[] { externalTool, "-f", file.file().getAbsoluteFile().getCanonicalPath(),
				"-v" };

		final Process process = new ProcessBuilder(args).redirectOutput(tempResultsFile).start();
		LOGGER.debug("Running SQLCheck with {}", Arrays.toString(args));
		final int result = process.waitFor();
		if (result != 0 || !tempResultsFile.exists() || tempResultsFile.length() == 0) {
			LOGGER.warn("Was not able to run SQLCheck with {}", Arrays.toString(args));
			return;
		}
		final List<SQLCheckIssue> issues = reader.read(tempResultsFile);
		synchronized (context) {
			for (final SQLCheckIssue issue : issues) {
				try {
					context.newAdHocRule().description(issue.description).engineId(this.repositoryName).name(issue.name)
							.ruleId(issue.getId()).severity(Severity.MAJOR).type(RuleType.CODE_SMELL).save();

					NewExternalIssue externalIssue = context.newExternalIssue().ruleId(issue.getId())
							.severity(Severity.MAJOR).type(RuleType.CODE_SMELL).engineId(this.repositoryName);
					NewIssueLocation loc = externalIssue.newLocation().on(file).message(issue.message);
					externalIssue.at(loc).save();
				} catch (Exception e) {
					LOGGER.debug("Unexpected error adding issue on file {}: {} ", file, e);
				}

			}

		}
	}

}
