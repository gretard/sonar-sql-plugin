package org.antlr.sql.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.apache.commons.io.IOUtils;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RulesHelperTool {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		if (args.length != 4) {
			System.out.println("Please pass the following: ");
			System.out.println("\taction (print or  verify)");
			System.out.println("\ttype (text or  file)");
			System.out.println("\tvalue (sql string or path to folder) ");
			System.out.println("\tdialect (tsql, pssql, mysql) ");

			System.out.println("Example:\r\nprint text \"SELECT * FROM dbo.test;\" tsql\r\n");
			System.out.println("Example:\r\nverify file \"c:/tests/customRules.rules;\" mysql");

			return;
		}

		String action = args[0];
		String type = args[1];
		String value = args[2];
		String dialect = "tsql";
		if (args.length > 3) {
			dialect = args[3];
		}
		Dialects sqlDialect = Dialects.valueOf(dialect.toUpperCase());

		String text = value;

		if (!"text".equals(type)) {
			text = IOUtils.toString(new FileInputStream(value), "UTF-8");
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
		System.out.println("text");

		org.antlr.sql.sca.IssuesProvider issuesProvider = new IssuesProvider();
		for (SqlRules rule : rules) {
			System.out.println("Checking repository: " + rule.getRepoName());
			for (Rule r : rule.getRule()) {
				SqlRules temp = new SqlRules();
				temp.getRule().add(r);
				
				System.out.println("Checking rule: " + r.getKey());
				for (String s : r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()) {
					
					AntlrContext ctx = sqlDialect.parse(s);
					ctx.rules.clear();
					ctx.rules.add(temp);
					boolean res = issuesProvider.analyze(ctx).size() == 0;
					System.out.println("\tc passed: " + res + " for " + s);
				}
				for (String s : r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()) {
					AntlrContext ctx = sqlDialect.parse(s);
					ctx.rules.clear();
					ctx.rules.add(temp);
					boolean res = issuesProvider.analyze(ctx).size() > 0;
					System.out.println("\tv passed: " + res + " for " + s);
				}

			}
		}

	}

}
