package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.TempFolder;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.sensors.sqlcheck.SQLCheckIssuesReader;

public class SqlCheckSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(SqlCheckSensor.class);

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
			final long timeout = context.config().getLong(Constants.PLUGIN_SQL_SCA_TIMEOUT)
					.orElse(Constants.PLUGIN_SQL_SCA_TIMEOUT_DEFAULT);

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

		final SqlIssuesList issues = reader.read(file.filename(), tempResultsFile);
		addIssues(context, issues, file);
	}

}
