package org.antlr.sql.models.matchers;

import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.SQLDialectRules;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.antlr.sql.sca.SqlIssue;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class IssuesProviderTestsIT {

	@Test
	public void testViolatingStatements() {
		IssuesProvider sut = new IssuesProvider();

		List<SqlRules> rules = SQLDialectRules.INSTANCE.getRules();

		for (SqlRules rList : rules) {
			for (Rule rule : rList.getRule()) {
				for (String v : rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()) {
					AntlrContext ctx = Dialects.TSQL.parse(v);
					SqlRules a = new SqlRules();
					a.getRule().add(rule);
					ctx.rules = Arrays.asList(a);
					List<SqlIssue> issues = sut.analyze(ctx);
					Assert.assertTrue("Expected issue on : " + v + " for rule: " + rule.getKey(), !issues.isEmpty());
				}
			}
		}

	}

	@Test
	public void testNonViolatingStatements() {
		IssuesProvider sut = new IssuesProvider();

		List<SqlRules> rules = SQLDialectRules.INSTANCE.getRules();

		for (SqlRules rList : rules) {
			for (Rule rule : rList.getRule()) {
				for (String v : rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()) {
					AntlrContext ctx = Dialects.TSQL.parse(v);
					SqlRules a = new SqlRules();
					a.getRule().add(rule);
					ctx.rules = Arrays.asList(a);
					List<SqlIssue> issues = sut.analyze(ctx);
					Assert.assertTrue("Expected no issue on : " + v + " for rule: " + rule.getKey(), issues.isEmpty());
				}
			}
		}

	}

}
