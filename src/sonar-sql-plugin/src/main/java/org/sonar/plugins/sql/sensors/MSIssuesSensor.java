package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
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
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.models.msissues.MsIssues;
import org.sonar.plugins.sql.models.msissues.MsIssues.Problem;

public class MSIssuesSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(MSIssuesSensor.class);
	private final String repositoryName = Constants.TSQL_MS_ENGINEID;

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey).onlyWhenConfiguration(x -> x.get(Constants.PLUGIN_SQL_DIALECT)
				.orElse(Dialects.TSQL.name()).equalsIgnoreCase(Dialects.TSQL.name()));

	}

	@Override
	public void execute(final SensorContext context) {
		final File baseDir = context.fileSystem().baseDir();
		final String filePath = context.config().get(Constants.TSQL_MS_ISSUES).orElse(Constants.TSQL_MS_ISSUES_DEFAULT)
				.toLowerCase();
		try {
			Files.walk(baseDir.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().toLowerCase().contains(filePath))
					.forEach(p -> {
						LOGGER.debug("Found file with issues {}", p.toString());

						try (final BOMInputStream stream = new BOMInputStream(new FileInputStream(p.toFile()))) {

							final MsIssues issues = read(stream);

							for (final Problem problem : issues.getProblem()) {

								final List<InputFile> files = find(context, problem.getSourceFile());
								if (files.size() != 1) {
									LOGGER.info("File for adding issue can't be determined {}, was: '{}'",
											problem.getSourceFile(), files);
									continue;
								}
								final InputFile file = files.get(0);
								try {
									final NewExternalIssue newExternalIssue = context.newExternalIssue()
											.ruleId(problem.getRule()).engineId(repositoryName)
											.type(RuleType.CODE_SMELL);
									final NewIssueLocation location = newExternalIssue.newLocation().on(file)
											.message(problem.getProblemDescription())
											.at(file.selectLine(problem.getLine()));
									newExternalIssue.at(location).severity(extractSeverity(problem)).save();
								} catch (Exception e) {
									LOGGER.warn("Unexpected error while adding issues on " + file, e);
								}
							}

						} catch (JAXBException e) {
							LOGGER.warn("Unexpected error deserializing: " + p.toString(), e);
						} catch (FileNotFoundException e1) {
							LOGGER.warn("Unexpected error reading: " + p.toString(), e1);
						} catch (IOException e1) {
							LOGGER.warn("Unexpected IO error: " + p.toString(), e1);

						}

					});
		} catch (Throwable e) {
			LOGGER.warn("Unexpected error", e);

		}

	}

	private static MsIssues read(final InputStream stream) throws JAXBException {
		final JAXBContext jaxbContext = JAXBContext.newInstance(MsIssues.class);
		final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		final MsIssues data = (MsIssues) jaxbUnmarshaller.unmarshal(stream);
		return data;
	}

	private static Severity extractSeverity(Problem problem) {
		String val = "MAJOR";

		if (problem.getSeverity() != null) {
			val = problem.getSeverity().toUpperCase();
		}
		if ("WARNING".equalsIgnoreCase(val)) {
			val = "MAJOR";
		}
		return Severity.valueOf(val);
	}

}
