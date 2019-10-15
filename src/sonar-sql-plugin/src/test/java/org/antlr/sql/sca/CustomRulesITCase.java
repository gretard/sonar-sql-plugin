package org.antlr.sql.sca;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.antlr.sql.dialects.TSQLDialect;
import org.antlr.sql.models.AntlrContext;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class CustomRulesITCase {

    private final IssuesProvider sut = new IssuesProvider();

    @Test
    public void test() throws Exception {
        SqlRules rules = AdhocRulesProvider.read(new File("./src/test/resources/tsql/rules1.xml"));
        TSQLDialect d = new TSQLDialect();

        for (Rule r : rules.getRule()) {
            for (String t : r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()) {
                AntlrContext ctx = d.parse(t);
                ctx.rules.clear();
                ctx.rules.add(rules);
                System.out.println(t);
                Map<String, Set<SqlIssue>> issues = sut.analyze(ctx).getIssues();
                for (Entry<String, Set<SqlIssue>> temp : issues.entrySet()) {
                    for (SqlIssue iss : temp.getValue()) {
                        System.out.println("ISS: " + iss.line + " " + iss.getDescription());
                    }
                    Assert.assertTrue(t, issues.size() > 0);
                }
            }
            for (String t : r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()) {
                AntlrContext ctx = d.parse(t);
                ctx.rules.clear();
                ctx.rules.add(rules);
                System.out.println(t);
                Map<String, Set<SqlIssue>> issues = sut.analyze(ctx).getIssues();
                for (Entry<String, Set<SqlIssue>> temp : issues.entrySet()) {
                    for (SqlIssue iss : temp.getValue()) {
                        System.out.println("ISS: " + iss.line + " " + iss.getDescription());
                    }
                    Assert.assertTrue(t, issues.size() == 0);
                }
            }

        }

    }
}
