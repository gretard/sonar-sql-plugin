package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SQLCheckIssuesReader {
    private static final Logger LOGGER = Loggers.get(SQLCheckIssuesReader.class);

    private static final Pattern issueDescriptionPattern =
            Pattern.compile("●\\s+(.*):?\\r?\\n([^●]+)");
    private static final Pattern riskPattern =
            Pattern.compile("\\[([^\\]]+)\\]:\\s+(\\(.+\\))\\s+(\\(.+\\))\\s+(.+)");

    public SqlIssuesList read(String inputFile, File file) throws IOException {
        SqlIssuesList list = new SqlIssuesList();
        try {
            String txt = Files.readString(file.toPath());
            Matcher matcher = riskPattern.matcher(txt);

            List<MatchResult> matchResults = matcher.results().toList();
            for (int i = 0; i < matchResults.size(); i++) {

                MatchResult matchResult = matchResults.get(i);

                String risk = matchResult.group(2).replace("(", "").replace(")", "");
                String patternName = matchResult.group(4);

                int startIndex = matchResult.end();
                int endIndex =
                        i == matchResults.size() - 1
                                ? txt.length()
                                : matchResults.get(i + 1).start();

                String descriptionSearchString = txt.substring(startIndex, endIndex);
                Matcher descriptionsMatcher =
                        issueDescriptionPattern.matcher(descriptionSearchString);
                descriptionsMatcher
                        .results()
                        .forEach(
                                dm -> {
                                    String problem = dm.group(1).trim();
                                    if (problem.endsWith(":")) {
                                        problem = problem.substring(0, problem.length() - 1);
                                    }

                                    String description =
                                            dm.group(2)
                                                    .trim()
                                                    .split(
                                                            "==================== Summary"
                                                                    + " ===================")[0];

                                    SqlIssue issue = new SqlIssue();
                                    issue.description = description;
                                    issue.fileName = inputFile;
                                    issue.severity = risk;
                                    issue.message = String.format("[%s] %s", patternName, problem);
                                    issue.name = String.format("[%s] %s", patternName, problem);
                                    issue.repo = Constants.SQL_SQLCHECK_ENGINEID;
                                    issue.isAdhoc = true;
                                    issue.isExternal = true;
                                    issue.key = String.format("[%s] %s", patternName, problem);
                                    list.addIssue(issue);
                                });
            }
        } catch (Exception e) {
            LOGGER.warn("Unexpected error parsing file", e);
        }
        return list;
    }
}
