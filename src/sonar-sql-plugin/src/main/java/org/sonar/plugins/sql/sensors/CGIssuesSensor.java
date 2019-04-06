package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.antlr.sql.dialects.Dialects;
import org.apache.commons.io.input.BOMInputStream;
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
import org.sonar.plugins.sql.models.cgissues.CodeGuardIssues;
import org.sonar.plugins.sql.models.cgissues.CodeGuardIssues.File.Issue;

public class CGIssuesSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(CGIssuesSensor.class);

	private final String repositoryName = Constants.TSQL_CG_ENGINEID;

	private final TempFolder tempFolder;

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey).onlyWhenConfiguration(x -> x.get(Constants.PLUGIN_SQL_DIALECT)
				.orElse(Dialects.TSQL.name()).equalsIgnoreCase(Dialects.TSQL.name()));

	}

	public CGIssuesSensor(final TempFolder tempFolder) {
		this.tempFolder = tempFolder;

	}

	private static CodeGuardIssues read(final InputStream stream) throws JAXBException {
		final JAXBContext jaxbContext = JAXBContext.newInstance(CodeGuardIssues.class);
		final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		final CodeGuardIssues data = (CodeGuardIssues) jaxbUnmarshaller.unmarshal(stream);
		return data;
	}

	@Override
	public void execute(SensorContext context) {
		final String externalTool = context.config().get(Constants.TSQL_CG_PATH).orElse(Constants.TSQL_CG_PATH_DEFAULT)
				.toLowerCase();
		final String sourceDir = context.fileSystem().baseDir().getAbsolutePath();
		try {
			if (!Files.exists(Paths.get(externalTool))) {
				LOGGER.info("Skip running external tool as executable not found {}", externalTool);
				return;
			}

			final File tempResultsFile = tempFolder.newFile("temp", "results.xml");

			final String[] args = new String[] { externalTool, "-source", sourceDir, "-out",
					tempResultsFile.getAbsolutePath(), "/include:all" };

			final Process process = new ProcessBuilder(args).start();
			LOGGER.debug("Running SQLCodeGuard with {}", Arrays.toString(args));

			final int result = process.waitFor();
			if (result != 0 || !tempResultsFile.exists() || tempResultsFile.length() == 0) {
				LOGGER.warn("Was not able to run SQLCodeGuard with {}", Arrays.toString(args));
				return;
			}
			try (BOMInputStream stream = new BOMInputStream(new FileInputStream(tempResultsFile))) {

				final CodeGuardIssues issues = read(stream);

				for (org.sonar.plugins.sql.models.cgissues.CodeGuardIssues.File f : issues.getFile()) {

					final List<InputFile> files = find(context, f.getFullname());
					if (files.isEmpty()) {
						LOGGER.debug("Was not able to find file {} to add issues", f.getFullname());
						continue;
					}
					final InputFile file = files.get(0);
					for (final Issue is : f.getIssue()) {
						try {
							NewExternalIssue newExternalIssue = context.newExternalIssue().ruleId(is.getCode())
									.engineId(repositoryName).type(RuleType.CODE_SMELL);
							NewIssueLocation location = newExternalIssue.newLocation().on(file).message(is.getText())
									.at(file.selectLine(is.getLine()));
							newExternalIssue.at(location).severity(extractSeverity(is.getSeverity())).save();
						} catch (Throwable e) {
							LOGGER.warn("Unexpected error adding issue on file " + f.getFullname(), e);

						}
					}
				}
			}

		} catch (Throwable e) {
			LOGGER.warn("Unexpected error", e);
		}

	}

	private final Severity extractSeverity(String severity) {
		String val = "MAJOR";

		if (severity != null) {
			val = severity.toUpperCase();
		}
		if ("WARNING".equalsIgnoreCase(val)) {
			val = "MAJOR";
		}
		return Severity.valueOf(val);
	}

}
