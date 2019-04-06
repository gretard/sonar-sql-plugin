package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SQLCheckIssuesReader {

	public List<SQLCheckIssue> read(File file) throws IOException {

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
		List<SQLCheckIssue> issues = new ArrayList<>();
		int i = start;

		String statement = null;
		String risk = null;
		while (i < end) {

			String line = lines.get(i);
			if (line.startsWith("SQL Statement:")) {
				statement = line;
				risk = lines.get(i + 1);
			}

			if (line.startsWith("●")) {
				String issueName = line;
				StringBuilder issueDescription = new StringBuilder();
				for (int j = i + 1; j < end; j++) {
					String temp = lines.get(j);
					if (temp.isEmpty() || temp.contains("[Matching Expression:")) {
						break;
					}
					issueDescription.append(temp + " ");

				}
				SQLCheckIssue issue = new SQLCheckIssue();
				issue.description = issueDescription.toString().trim();
				issue.name = issueName.substring(2, issueName.length()).split(":", 2)[0].trim();
				issue.risk = risk.split("\\(", 2)[1].split("\\)", 2)[0].trim();
				issue.statement = statement.split(":", 2)[1].trim();
				issue.message = risk.substring(risk.lastIndexOf(')') + 1).trim();
				issues.add(issue);
			}
			i++;
		}

		return issues;
	}

	public static class SQLCheckIssue {
		@Override
		public String toString() {
			return "SQLCheckIssue [message=" + message + ", statement=" + statement + ", description=" + description
					+ ", name=" + name + ", risk=" + risk + "]";
		}

		public String getId() {
			return name + "_" + message;
		}

		public String message;
		public String statement;
		public String description;

		public String name;

		public String getSeverity() {
			if (StringUtils.containsIgnoreCase(risk, "HIGH")) {
				return "MAJOR";
			}
			if (StringUtils.containsIgnoreCase(risk, "LOW")) {
				return "TRIVIAL";
			}
			return "MINOR";

		}

		public String risk;
	}
}
