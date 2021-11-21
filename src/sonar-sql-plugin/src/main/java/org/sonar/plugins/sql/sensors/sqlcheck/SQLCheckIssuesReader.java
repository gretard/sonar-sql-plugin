package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SQLCheckIssuesReader {
    private static final Logger LOGGER = Loggers.get(SQLCheckIssuesReader.class);

    public SqlIssuesList read(String inputFile, File file) throws IOException {
        SqlIssuesList list = new SqlIssuesList();
        List<String> lines = Files.readAllLines(file.toPath());

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (!line.startsWith("SQL Statement: ")) {
                continue;
            }
            String severityDescription = lines.get(i + 1).trim();
            for (int j = i + 2; j < lines.size(); j++) {
                String issueName = lines.get(j).trim();
                ;
                if (issueName.isEmpty()) {
                    continue;
                }

                if (lines.get(j).startsWith("------") || lines.get(j).startsWith("SQL Statement")) {
                    break;
                }
                if (issueName.startsWith("● ")) {
                    try {
                        StringBuilder descriptionSb = new StringBuilder();
                        for (int z = j + 1; z < lines.size(); z++) {
                            String tempLine = lines.get(z).trim();
                            if (tempLine.startsWith("● ") || tempLine.isEmpty()
                                    || tempLine.startsWith("SQL Statement")) {
                                break;
                            }
                            if (tempLine.equalsIgnoreCase("Problems:")) {
                                continue;
                            }

                            descriptionSb.append(tempLine);
                        }
                        if (descriptionSb.length() == 0 || severityDescription.isEmpty() || issueName.isEmpty()) {
                            continue;
                        }
                        SqlIssue issue = new SqlIssue();
                        issue.description = descriptionSb.toString().trim();
                        issue.fileName = inputFile;
                        issue.severity = extractSeverity(severityDescription);
                        issue.message = extractMessage(severityDescription);
                        issue.name = extractName(issueName);
                        issue.repo = Constants.SQL_SQLCHECK_ENGINEID;
                        issue.isAdhoc = true;
                        issue.isExternal = true;
                        issue.key = extractName(issueName);
                        list.addIssue(issue);
                    } catch (Exception e) {
                        LOGGER.info("Unexpected error reading: {}. Exception was: {}", line, e);
                    }
                }

            }

        }

        return list;
    }

    private String extractName(String issueName) {
        return issueName.replace("● ", "");
    }

    private String extractMessage(String severityDescription) {
        String[] data = severityDescription.split("\\)", 3);
        if (data.length < 3) {
            return "Unknown";
        }
        return data[2].trim();
    }

    private String extractSeverity(String severityDescription) {
        String[] data = severityDescription.split("\\(", 3);
        if (data.length < 3) {
            return "HIGH RISK";
        }
        String severity = data[1].replace("(", "").replace(")", "").trim();
        return severity;
    }
}
