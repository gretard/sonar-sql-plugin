package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Pattern;

import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SQLCheckIssuesReader {
	private static final Logger LOGGER = Loggers.get(SQLCheckIssuesReader.class);

	private static final Pattern issueDescriptionPattern = Pattern.compile("●\\s+(.*):?\\r?\\n([^●]+)");
	private static final Pattern riskPattern = Pattern.compile("\\[([^\\]]+)\\]:\\s+(\\(.+\\))\\s+(\\(.+\\))\\s+(.+)");

	public SqlIssuesList read(String inputFile, File file) throws IOException {
		var list = new SqlIssuesList();
		try {
			var txt = Files.readString(file.toPath());
			var matcher = riskPattern.matcher(txt);

			var matchResults = matcher.results().toList();
			for (int i = 0; i < matchResults.size(); i++) {

				var matchResult = matchResults.get(i);

				var risk = matchResult.group(2).replace("(", "").replace(")", "");
				var patternName = matchResult.group(4);

				var startIndex = matchResult.end();
				var endIndex = i == matchResults.size() - 1 ? txt.length() : matchResults.get(i + 1).start();

				var descriptionSearchString = txt.substring(startIndex, endIndex);
				var descriptionsMatcher = issueDescriptionPattern.matcher(descriptionSearchString);
				descriptionsMatcher.results().forEach(dm -> {

					var problem = dm.group(1).trim();
					if (problem.endsWith(":")) {
						problem = problem.substring(0, problem.length() - 1);
					}

					var description = dm.group(2).trim().split("==================== Summary ===================")[0];

					var issue = new SqlIssue();
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
