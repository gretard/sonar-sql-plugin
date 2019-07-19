package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SQLCheckIssuesReader {

	public SqlIssuesList read(String inputFile, File file) throws IOException {
		SqlIssuesList list = new SqlIssuesList();
		List<String> lines = Files.readAllLines(file.toPath());
		int start = 0;
		for (String line : lines) {
			start++;
			if (StringUtils.containsIgnoreCase(line, "==================== Results ===================")) {
				break;
			}
		}
		int end = 0;
		for (String line : lines) {
			end++;
			if (StringUtils.containsIgnoreCase(line, "==================== Summary ===================")) {
				break;
			}

		}
		int i = start;

		String statement = null;
		String risk = null;
		while (i < end) {

			String line = lines.get(i);
			if (StringUtils.containsIgnoreCase(line, "SQL Statement:")) {
				statement = line;
				risk = lines.get(i + 1);
			}

			if (line.startsWith("●")) {
				String issueName = line;
				StringBuilder issueDescription = new StringBuilder();
				for (int j = i + 1; j < end; j++) {
					String temp = lines.get(j);
					if (temp.isEmpty() || StringUtils.containsIgnoreCase(temp, "[Matching Expression:")) {
						break;
					}
					issueDescription.append(temp + " ");

				}
				String statement0 = statement.split(":", 2)[1].trim();
				String message = risk.substring(risk.lastIndexOf(')') + 1).trim();
				;
				SqlIssue issue = new SqlIssue();
				issue.description = issueDescription.toString().trim();
				issue.fileName = inputFile;
				issue.severity = risk.split("\\(", 2)[1].split("\\)", 2)[0].trim();
				issue.name = issueName.substring(2, issueName.length()).split(":", 2)[0].trim();
				issue.message = StringUtils.isEmpty(statement0) ? message : message + " at " + statement0;
				issue.repo = Constants.SQL_SQLCHECK_ENGINEID;
				issue.isAdhoc = true;
				issue.isExternal = true;
				list.addIssue(issue);
			}
			i++;
		}

		return list;
	}
}
