package org.antlr.sql.sca;

import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class IssuesProviderTest {

	@Test
	public void testMapEmpty() {
		FoundMatch match = new FoundMatch();
		match.sqlRules = new SqlRules();
		match.rule = new Rule();
		SqlIssue issue = IssuesProvider.mapToSqlIssue(match);
		Assert.assertEquals(0, issue.getDebtRemediationEffort());
	}

	@Test
	public void testMapLinear() {
		FoundMatch match = new FoundMatch();
		match.sqlRules = new SqlRules();
		match.rule = new Rule();
		match.rule.setRemediationFunction("LINEAR");
		SqlIssue issue = IssuesProvider.mapToSqlIssue(match);
		Assert.assertEquals(0, issue.getDebtRemediationEffort());
	}

	@Test
	public void testMapLinearDefault() {
		FoundMatch match = new FoundMatch();
		match.sqlRules = new SqlRules();
		match.rule = new Rule();
		match.rule.setRemediationFunction("LINEAR");
		match.rule.setDebtRemediationFunctionCoefficient("1h 10min");
		SqlIssue issue = IssuesProvider.mapToSqlIssue(match);
		Assert.assertEquals(70, issue.getDebtRemediationEffort());
	}

	@Test
	public void testMapLinearWithInvalidValues() {
		FoundMatch match = new FoundMatch();
		match.sqlRules = new SqlRules();
		match.rule = new Rule();
		match.rule.setRemediationFunction("LINEAR");
		match.rule.setDebtRemediationFunctionCoefficient("1t");
		SqlIssue issue = IssuesProvider.mapToSqlIssue(match);
		Assert.assertEquals(0, issue.getDebtRemediationEffort());
	}
}
