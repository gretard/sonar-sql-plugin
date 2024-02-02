package org.antlr.sql.sca;

import java.io.IOException;
import java.util.List;
import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.rules.SnowflakeRules;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.tools.PrettyPrinter;
import org.antlr.v4.runtime.Token;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.plugins.sql.fillers.IssuesFiller;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SnowflakeDialectTest {
    private final IssuesFiller sut = new IssuesFiller();

    @Test
    public void testComments() throws IOException {

        AntlrContext antlrContext = parse("/**test**/\r\n---test\r\nselect 1;\r\n// test");

        Assert.assertNotNull(antlrContext);

        List<? extends Token> tokens = antlrContext.getAllTokens();
        Assert.assertFalse(tokens.isEmpty());
        Assert.assertTrue(antlrContext.isComment(tokens.get(0)));
        Assert.assertTrue(antlrContext.isComment(tokens.get(2)));
        Assert.assertTrue(antlrContext.isComment(tokens.get(9)));
    }

    @Test
    public void testKeywords() throws IOException {

        AntlrContext antlrContext = parse("select 1");

        Assert.assertNotNull(antlrContext);

        List<? extends Token> tokens = antlrContext.getAllTokens();
        Assert.assertFalse(tokens.isEmpty());
        Assert.assertTrue(antlrContext.isKeyword(tokens.get(0)));
    }

    @Test
    public void testString() throws IOException {
        AntlrContext antlrContext = parse("select '1', *, 1*4");

        Assert.assertNotNull(antlrContext);

        List<? extends Token> tokens = antlrContext.getAllTokens();
        Assert.assertFalse(tokens.isEmpty());
        Assert.assertTrue(antlrContext.isString(tokens.get(2)));
    }

    @Test
    public void testRules1() throws IOException {
        AntlrContext antlrContext =
                parse(
                        "SELECT * FROM t, TABLE(flatten(\r\n"
                                + "    INPUT => t.c\r\n"
                                + "    , PATH => ''\r\n"
                                + "    , OUTER => true\r\n"
                                + "    , RECURSIVE => true\r\n"
                                + "    , MODE => 'both'\r\n"
                                + "));");

        SqlIssuesList list = sut.getIssues(antlrContext);
        List<String> keys = list.getaLLIssues().stream().map(x -> x.getKey()).toList();
        Assertions.assertThat(keys).contains("C023", "C002"); // cartesian join, select *
    }

    @Test
    public void testImplicitColumnNameRules() throws IOException {
        AntlrContext antlrContext =
                parse("select a, 1,2 from t where (t.c, t.d) in (select c, d from t2);")
                        .withRules(SnowflakeRules.INSTANCE.getColumnListRule());

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList list = sut.getIssues(antlrContext);

        List<String> keys = list.getaLLIssues().stream().map(x -> x.getKey()).toList();
        Assertions.assertThat(keys).isEmpty();
    }

    @Test
    public void testNonSargableArgsRule() throws IOException {
        AntlrContext antlrContext =
                // parse("select department_id from employees group by department_id having
                // count (*) < 10")
                parse("select  department_id from employees where name = 'tst' ")
                        .withRules(SnowflakeRules.INSTANCE.getSargRule());

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        SqlIssuesList list = sut.getIssues(antlrContext);

        List<String> keys = list.getaLLIssues().stream().map(x -> x.getKey()).toList();
        Assertions.assertThat(keys).isEmpty();
    }

    //
    private static AntlrContext parse(String sql) {
        AntlrContext antlrContext = Dialects.SNOWFLAKE.parse(sql);

        // PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);
        // PrettyPrinter.printTokens(antlrContext);
        return antlrContext;
    }
}
