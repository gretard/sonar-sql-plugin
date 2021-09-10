package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.antlr.sql.dialects.Dialects;
import org.apache.commons.io.input.BOMInputStream;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.TempFolder;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

    protected SqlIssuesList read(final InputStream stream) throws Exception {

        SqlIssuesList issuesList = new SqlIssuesList();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(stream);

        NodeList list = doc.getElementsByTagName("issue");

        for (int i = 0; i < list.getLength(); i++) {
            try {
                Node n = list.item(i);

                String fileName = XmlHelper.readAttribute(n.getParentNode(), "fullname", null);
                String line = XmlHelper.readAttribute(n, "line", null);
                String message = XmlHelper.readAttribute(n, "text", null);
                String description = XmlHelper.readAttribute(n, "message", null);

                String severity = XmlHelper.readAttribute(n, "severity", null);
                String key = XmlHelper.readAttribute(n, "code", null);

                SqlIssue issue = new SqlIssue();
                issue.fileName = fileName;
                issue.isAdhoc = false;
                issue.isExternal = true;
                issue.key = key;
                issue.repo = repositoryName;
                issue.name = message;
                issue.message = message;
                issue.description = description;
                issue.line = Integer.parseInt(line);
                issue.severity = severity;
                if ("error".equalsIgnoreCase(severity)) {
                    issue.debtRemediationEffort = 10;
                    issue.severity = "BLOCKER";
                }
                if ("warning".equalsIgnoreCase(severity)) {
                    issue.debtRemediationEffort = 5;
                    issue.severity = "MAJOR";
                }
                issuesList.addIssue(issue);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return issuesList;
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

            final Process process = new ProcessBuilder(args).inheritIO().start();
            LOGGER.debug("Running SQLCodeGuard with {}", Arrays.toString(args));

            final int result = process.waitFor();
            if (!tempResultsFile.exists() || tempResultsFile.length() == 0) {
                LOGGER.warn("SQLCodeGuard returned with '{}'. Arguments were: {}", result, Arrays.toString(args));
                return;
            }
            try (final BOMInputStream stream = new BOMInputStream(new FileInputStream(tempResultsFile))) {

                final SqlIssuesList issues = read(stream);
                addIssues(context, issues, null);
            }

        } catch (Throwable e) {
            LOGGER.warn("Unexpected error", e);
        }

    }

}
