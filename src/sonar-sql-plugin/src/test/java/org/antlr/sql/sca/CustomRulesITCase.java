package org.antlr.sql.sca;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.antlr.sql.dialects.TSQLDialect;
import org.antlr.sql.dialects.tsql.TSqlParser.Common_table_expressionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.IdContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Join_partContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Select_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_source_itemContext;
import org.antlr.sql.dialects.tsql.TSqlParser.With_table_hintsContext;
import org.antlr.sql.models.AntlrContext;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class CustomRulesITCase {

    TSQLDialect d = new TSQLDialect();

    @Test
    public void testRules() throws Exception {

        RuleImplementation main = new RuleImplementation();
        main.getNames().getTextItem().add(Table_source_itemContext.class.getSimpleName());
        main.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        main.setRuleViolationMessage("MAIN");

        {
            RuleImplementation select = new RuleImplementation();
            select.getNames().getTextItem().add(IdContext.class.getSimpleName());
            select.setRuleMatchType(RuleMatchType.FULL);
            select.setRuleViolationMessage("ID");

            RuleImplementation name = new RuleImplementation();
            name.getNames().getTextItem().add(Common_table_expressionContext.class.getSimpleName());
            name.setRuleResultType(RuleResultType.SKIP_IF_FOUND);
            name.setRuleViolationMessage("CTE");
            name.setDistance(1);
            name.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);

            select.getParentRules().getRuleImplementation().add(name);

            main.getUsesRules().getRuleImplementation().add(select);
        }

        {
            RuleImplementation select = new RuleImplementation();
            select.getNames().getTextItem().add(Join_partContext.class.getSimpleName());
            select.getNames().getTextItem().add(Select_statementContext.class.getSimpleName());
            select.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            select.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
            select.setRuleViolationMessage("MAINSELECTS");
            RuleImplementation child = new RuleImplementation();
            child.getNames().getTextItem().add(With_table_hintsContext.class.getSimpleName());
            child.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
            child.setRuleViolationMessage("HINTS");

            select.getChildrenRules().getRuleImplementation().add(child);
            main.getParentRules().getRuleImplementation().add(select);
        }
        {
            RuleImplementation select = new RuleImplementation();
            select.getNames().getTextItem().add(Select_statementContext.class.getSimpleName());
            select.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            select.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
        }
        {
            RuleImplementation select = new RuleImplementation();
            select.getNames().getTextItem().add(Common_table_expressionContext.class.getSimpleName());
            select.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        }
        SqlRules rules = new SqlRules();
        Rule r = new Rule();
        r.setRuleImplementation(main);
        rules.getRule().add(r);
        String s = "update test set x = 1 from dbo.testUpdate as t1 inner join dbo.tss with (nolock) as t2 \r\non t1.id = t2.id \r\nleft join dbo.gg on t1.id = t2.id";

        AntlrContext ctx = d.parse(s);
        ctx.rules.clear();
        ctx.rules.add(rules);
        // PrettyPrinter.print(ctx.root, 0, null);
        Map<String, Set<SqlIssue>> issues = sut.analyze(ctx).getIssues();

        for (Entry<String, Set<SqlIssue>> is : issues.entrySet()) {
            System.out.println("ISSUE: " + is + " " + is.getValue());
        }

        Assert.assertFalse(s, issues.isEmpty());
    }

    private final IssuesProvider sut = new IssuesProvider();

    @Test
    public void test() throws Exception {
        SqlRules rules = AdhocRulesProvider.read(new File("./src/test/resources/tsql/rules2.xml"));

        for (Rule r : rules.getRule()) {
            for (String t : r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()) {
                AntlrContext ctx = d.parse(t);
                ctx.rules.clear();
                ctx.rules.add(rules);
                Map<String, Set<SqlIssue>> issues = sut.analyze(ctx).getIssues();
                for (Entry<String, Set<SqlIssue>> is : issues.entrySet()) {
                    System.out.println("ISSUE: " + is + " " + is.getValue());
                }
                for (Entry<String, Set<SqlIssue>> temp : issues.entrySet()) {
                    Assert.assertTrue(t, temp.getValue().size() > 0);
                }

            }
            for (String t : r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()) {
                AntlrContext ctx = d.parse(t);
                ctx.rules.clear();
                ctx.rules.add(rules);
                Map<String, Set<SqlIssue>> issues = sut.analyze(ctx).getIssues();
                for (Entry<String, Set<SqlIssue>> is : issues.entrySet()) {
                    System.out.println("ISSUE: " + is + " " + is.getValue());
                }

                for (Entry<String, Set<SqlIssue>> temp : issues.entrySet()) {
                    Assert.assertTrue(t, temp.getValue().isEmpty());
                }
            }

        }

    }
}
