package org.antlr.sql.sca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.SQLDialectRules;
import org.antlr.sql.dialects.rules.CommonRules;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.tools.PrettyPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.sonar.api.issue.Issue;
import org.sonar.api.utils.log.LoggerLevel;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.fillers.CommentIssuesFiller;
import org.sonar.plugins.sql.fillers.IssuesFiller;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

@RunWith(Parameterized.class)
public class PluginCommentRulesITCase {

    private final CommentIssuesFiller sut = new CommentIssuesFiller();

    @Parameters(name = "{3}: {1} - {0} ({index})")
    public static Iterable<Object[]> data() throws Throwable {

        final List<Object[]> data = new ArrayList<>();

        List<SqlRules> rules = CommonRules.INSTANCE.getRules();

        for (final SqlRules rule : rules) {

            for (final Rule r : rule.getRule()) {

                r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample().forEach(t -> {
                    data.add(new Object[] { t, r.getKey(), r,

                            true

                    });

                });

                r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample().forEach(t -> {
                    data.add(new Object[] { t, r.getKey(), r, false

                    });

                });
            }
        }

        return data;
    }

    @Test
    public void test() throws Throwable {
        Loggers.get(IssuesProvider.class).setLevel(LoggerLevel.DEBUG);
        AntlrContext ctx = new AntlrContext();
        ctx.initialContents = text;
        SqlRules a = new SqlRules();
        a.getRule().add(rule);
        ctx.rules.clear();
        ctx.rules.addAll(Arrays.asList(a));
        SqlIssuesList list = sut.getIssues(ctx);
        Collection<SqlIssue> issues = list.getaLLIssues();

        if (issueExists && issues.isEmpty() || !issueExists && !issues.isEmpty()) {
            PrettyPrinter.print(ctx.root, 0, ctx.stream);
        }

        Assert.assertTrue("Found issues on : " + text + " for rule: " + rule.getKey() + " " + rule.getName()
                + " expected: " + issueExists, !issues.isEmpty() == issueExists);

    }

    @Test
    public void testRuleContainsViolationMessgae() throws Throwable {

        Assert.assertNotNull("Rule " + rule.getKey() + " does not contain violation message",
                rule.getRuleImplementation().getRuleViolationMessage());

    }

    private String text;
    private Rule rule;
    private boolean issueExists;

    public PluginCommentRulesITCase(String text, String ruleId, Rule rule, boolean issueExists) {
        this.text = text;
        this.rule = rule;
        this.issueExists = issueExists;

    }
}
