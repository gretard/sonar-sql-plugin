package org.sonar.plugins.sql.fillers;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Builtin_function_nameContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Sort_clauseContext;
import org.antlr.sql.dialects.rules.CommonRules;
import org.antlr.sql.dialects.rules.TSQLRules;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.tools.RulesToXmlPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class IssuesFillerSimpleTest {

	@Test
	public void testCommentIssues() throws IOException {

		CommentIssuesFiller filler = new CommentIssuesFiller();

		AntlrContext antlrContext = Dialects.TSQL
				.parse("/** testas */\r\nSELECT * From facts.test where name = 4;\r\n");

		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(0, issues.getaLLIssues().size());

	}

	@Test
	public void testCommentIssuesNoIssues() throws IOException, JAXBException {

		CommentIssuesFiller filler = new CommentIssuesFiller();

		AntlrContext antlrContext = Dialects.TSQL.parse("//test\r\nSELECT * From facts.test where name = 4;\r\n");

		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(1, issues.getaLLIssues().size());
		RulesToXmlPrinter.writeRules(CommonRules.INSTANCE.getRules().get(0));

	}

	@Test
	public void testCommentIssues2() throws IOException {

		CommentIssuesFiller filler = new CommentIssuesFiller();

		AntlrContext antlrContext = Dialects.TSQL
				.parse("\r\n\r\n/*aavvv*/SELECT * From facts.test where name = /*aavvv*/ 4;\r\n\r\n");
		// AntlrContext antlrContext = Dialects.TSQL.parse("\r\nSELECT * From facts.test
		// where name = 4;\r\n\r\n");

		// PrettyPrinter.print(filler.getRoot(antlrContext), 0, null);

		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(0, issues.getaLLIssues().size());

	}

	@Test
	public void testIssues() throws IOException {

		IssuesFiller filler = new IssuesFiller();

		AntlrContext antlrContext = Dialects.TSQL
				.parse("/** testas */\r\nSELECT * From facts.test where name = 4;\r\nselect * from dbo.test;");

		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(2, issues.getaLLIssues().size());

	}

	@Test
	public void testRandomOrderIssue() throws IOException, JAXBException {

		Rule rule = new Rule();
		rule.setKey("R001");
		rule.setName("Random order is used");
		rule.setDescription("Rule description");

		RuleImplementation ruleImpl = new RuleImplementation();
		ruleImpl.getNames().getTextItem().add(Builtin_function_nameContext.class.getSimpleName());
		ruleImpl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		ruleImpl.getTextToFind().getTextItem().add("RANDOM");
		ruleImpl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation parentRule = new RuleImplementation();
		parentRule.getNames().getTextItem().add(Sort_clauseContext.class.getSimpleName());
		parentRule.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		parentRule.getChildrenRules().getRuleImplementation().add(ruleImpl);
		parentRule.setRuleViolationMessage("Call to RANDOM() function found in order clause");

		rule.setRuleImplementation(parentRule);

		SqlRules rules = new SqlRules();
		rules.getRule().add(rule);
		IssuesFiller filler = new IssuesFiller();
		AntlrContext antlrContext = Dialects.PSSQLV2.parse("SELECT name from names order by random()");

		antlrContext.getRules().clear();
		antlrContext.getRules().add(rules);
		// PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);
		// RulesToXmlPrinter.writeRules(rules);
		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(1, issues.getaLLIssues().size());

	}

	@Test
	public void testInsertIssues() throws IOException {

		IssuesFiller filler = new IssuesFiller();
		Rule rule = TSQLRules.INSTANCE.getRules().get(0).getRule().stream().filter(x -> x.getKey().equals("C003"))
				.findFirst().get();
		AntlrContext antlrContext = Dialects.TSQL
				.parse("INSERT INTO dbo.test VALUES (1,2);\r\nINSERT INTO dbo.test VALUES (1,2);");

		antlrContext.getRules().get(0).getRule().clear();
		antlrContext.getRules().get(0).getRule().add(rule);

		SqlIssuesList issues = filler.getIssues(antlrContext);
		Assert.assertEquals(2, issues.getaLLIssues().size());

	}
}
