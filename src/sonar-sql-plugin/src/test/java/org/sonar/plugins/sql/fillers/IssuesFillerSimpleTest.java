package org.sonar.plugins.sql.fillers;

import java.io.IOException;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.rules.TSQLRules;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.tools.PrettyPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.Rule;

public class IssuesFillerSimpleTest {

    @Test
    public void testCommentIssues() throws IOException {

        CommentIssuesFiller filler = new CommentIssuesFiller();

        AntlrContext antlrContext = Dialects.TSQL
                .parse("/** testas */\r\nSELECT * From facts.test where name = 4;\r\n");

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList issues = filler.getIssues(antlrContext);
        Assert.assertEquals(0, issues.getaLLIssues().size());

    }

    @Test
    public void testCommentIssuesNoIssues() throws IOException {

        CommentIssuesFiller filler = new CommentIssuesFiller();

        AntlrContext antlrContext = Dialects.TSQL.parse("//test\r\nSELECT * From facts.test where name = 4;\r\n");

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList issues = filler.getIssues(antlrContext);
        Assert.assertEquals(1, issues.getaLLIssues().size());

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

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList issues = filler.getIssues(antlrContext);
        Assert.assertEquals(2, issues.getaLLIssues().size());

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
        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList issues = filler.getIssues(antlrContext);
        Assert.assertEquals(2, issues.getaLLIssues().size());

    }
}
