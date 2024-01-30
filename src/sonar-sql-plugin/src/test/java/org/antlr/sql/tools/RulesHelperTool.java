package org.antlr.sql.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.apache.commons.io.IOUtils;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RulesHelperTool {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		if (args.length < 4) {
			System.out.println("Please pass the following: ");
			System.out.println("\taction  (print, verify or analyze)");
			System.out.println("\ttype    (text or file)");
			System.out.println("\tvalue   (sql string or path to rules file/folder) ");
			System.out.println("\tdialect (tsql, pssql, mysql, pssql, pssqlv2, snowflake)");
			System.out.println("\tfolder  (folder to analyze, only applicable when using analyze action)");

			System.out.println("\r\nExample to print AST tree:\r\n\tprint text \"SELECT * FROM dbo.test;\" tsql");

			System.out.println(
					"\r\nExample to verify custom rules definitions:\r\n\tverify file \"c:/tests/customRules.rules;\" mysql");
			System.out.println(
					"\r\nExample to execute custom rules and plugin rules against specified folder:\r\n\tanalyze file \"c:/tests/customRules.rules;\" snowflake \"c:\\docs\\src\"");
			System.out.println(
					"\r\nExample to execute sql analysis againt specified folder:\r\n\tanalyze file \"NA\" snowflake \"c:\\docs\\src\"");

			return;
		}

		String action = args[0];
		String type = args[1];
		String value = args[2];
		String dialect = "tsql";
		String folder = ".";
		if (args.length > 3) {
			dialect = args[3];
		}
		if (args.length > 4) {
			folder = args[4];
		}
		Dialects sqlDialect = Dialects.valueOf(dialect.toUpperCase());

		String text = value;

		if (!"text".equals(type)) {
			File file = new File(value);
			if (file.exists()) {
				text = IOUtils.toString(new FileInputStream(file), "UTF-8");
			}
		}
		if ("print".equalsIgnoreCase(action)) {
			System.out.println("Printing tree:\r\n");
			AntlrContext ctx = sqlDialect.parse(text);
			PrettyPrinter.print(ctx.root, 0, ctx.stream);
			return;

		}

		AdhocRulesProvider adhocRulesProvider = new AdhocRulesProvider();
		List<SqlRules> rules = adhocRulesProvider.getAdhocRules(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIXES_DEFAULT,
				".", value);
		org.antlr.sql.sca.IssuesProvider issuesProvider = new IssuesProvider();

		if ("verify".equalsIgnoreCase(action)) {
			System.out.println("Verifying rules:\r\n");
			for (SqlRules rule : rules) {
				System.out.println("Checking repository: " + rule.getRepoName());
				for (Rule r : rule.getRule()) {
					SqlRules temp = new SqlRules();
					temp.getRule().add(r);

					System.out.println("Checking rule: " + r.getKey());
					for (String s : r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()) {

						AntlrContext ctx = sqlDialect.parse(s);
						Collection<SqlIssue> list = issuesProvider.check(RuleToCheck.createCodeList2(temp), ctx.root)
								.getaLLIssues();

						boolean res = list.size() == 0;
						System.out.println("\tc passed: " + res + " for " + s);
					}
					for (String s : r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()) {
						AntlrContext ctx = sqlDialect.parse(s);
						Collection<SqlIssue> list = issuesProvider.check(RuleToCheck.createCodeList2(temp), ctx.root)
								.getaLLIssues();
						boolean res = list.size() > 0;
						System.out.println("\tv passed: " + res + " for " + s);
					}

				}
			}
			return;

		}

		if ("analyze".equalsIgnoreCase(action)) {
			File fileDir = new File(folder);
			System.out.printf("Analyzing folder: %s%n", fileDir);

			List<SqlRules> sqlDialectRulesWithCustomRules = sqlDialect.getDialectRules(rules.toArray(new SqlRules[0]));
			List<RuleToCheck> rulesToBeChecked = RuleToCheck.createCodeList2(sqlDialectRulesWithCustomRules);

			boolean anyIssueFound = false;

			Path sourcePath = fileDir.toPath();
			List<Path> filesToCheck = Files.walk(sourcePath).filter(f -> Files.isRegularFile(f)).toList();

			for (Path fileToCheck : filesToCheck) {
				try {
					String code = Files.readString(fileToCheck);
					AntlrContext ctx = sqlDialect.parse(code);

					SqlIssuesList issues = issuesProvider.check(rulesToBeChecked, ctx.root);
					for (SqlIssue iss : issues.getaLLIssues()) {
						System.out.printf("Issue found: \"%s(%s)\" at line %s in \"%s\" file%n", iss.getKey(),
								iss.getName(), iss.getLine(), sourcePath.relativize(fileToCheck));
						anyIssueFound = true;
					}

				} catch (Exception e) {
					System.out.printf("Issue analyzing file (%s): %s%n", fileToCheck, e.getMessage());
				}

			}
			if (anyIssueFound) {
				System.exit(-1);
			}
		}

	}

}
