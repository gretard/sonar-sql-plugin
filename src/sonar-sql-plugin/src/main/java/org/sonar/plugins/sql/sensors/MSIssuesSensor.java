package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.antlr.sql.dialects.Dialects;
import org.apache.commons.io.input.BOMInputStream;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

							final SqlIssuesList issues = read(stream);
							addIssues(context, issues, null);

						} catch (IOException e1) {
							LOGGER.warn("Unexpected IO error: " + p.toString(), e1);

						} catch (Exception e) {
							LOGGER.warn("Unexpected error: " + p.toString(), e);
						}

					});
		} catch (Throwable e) {
			LOGGER.warn("Unexpected error", e);

		}

	}

	private SqlIssuesList read(final InputStream stream) throws Exception {
		SqlIssuesList issuesList = new SqlIssuesList();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(stream);
		NodeList list = doc.getElementsByTagName("Problem");
		for (int i = 0; i < list.getLength(); i++) {
			try {
				Node parent = list.item(i);
				SqlIssue issue = new SqlIssue();
				issue.key = XmlHelper.getNodeValue(parent, "Rule");
				issue.isAdhoc = false;
				issue.severity = XmlHelper.getNodeValue(parent, "Severity");
				issue.fileName = XmlHelper.getNodeValue(parent, "SourceFile");
				issue.message = XmlHelper.getNodeValue(parent, "ProblemDescription");
				issue.line = Integer.parseInt(XmlHelper.getNodeValue(parent, "Line"));
				issue.repo = repositoryName;
				issue.isExternal = true;
				// this should be read from the rule
				issue.debtRemediationEffort = 5l;
				issuesList.addIssue(issue);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return issuesList;
	}

}
