package org.sonar.plugins.sql.sensors.sqlcheck;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.sonar.api.impl.utils.JUnitTempFolder;
import org.sonar.plugins.sql.issues.SqlIssue;

public class SQLCheckIssuesReaderTest {
    @Rule public TemporaryFolder folder = new TemporaryFolder();

    @org.junit.Rule public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();
    private final SQLCheckIssuesReader sut = new SQLCheckIssuesReader();

    @Test
    public void testSqlCheckResultsParsingPriorV1_3() throws IOException {

        File baseFile = folder.newFile("results.txt");
        FileUtils.copyURLToFile(getClass().getResource("/external/sqlcheck.txt"), baseFile);

        Collection<SqlIssue> results = sut.read("sqlCheckv1_2.sql", baseFile).getaLLIssues();

        SqlIssue expected = getExpectedIssueImplicitColumnUsage();

        assertThat(results)
                .hasSize(4)
                .filteredOn(x -> x.key, expected.key)
                .element(0)
                .usingRecursiveComparison()
                .ignoringFields("description")
                .isEqualTo(expected);
    }

    @Test
    public void testSqlCheckResultsParsingV1_3() throws IOException {

        File baseFile = folder.newFile("results.txt");
        FileUtils.copyURLToFile(getClass().getResource("/external/sqlCheck1.3.txt"), baseFile);

        Collection<SqlIssue> results = sut.read("sqlCheckv1_3.sql", baseFile).getaLLIssues();

        SqlIssue expected = getExpectedIssueForSelectStar();
        assertThat(results)
                .hasSize(4)
                .filteredOn(x -> x.key, expected.key)
                .element(0)
                .usingRecursiveComparison()
                .ignoringFields("description")
                .isEqualTo(expected);
    }

    private static SqlIssue getExpectedIssueImplicitColumnUsage() {
        SqlIssue issue = new SqlIssue();
        issue.fileName = "sqlCheckv1_2.sql";
        issue.isAdhoc = true;
        issue.repo = "sqlcheck";
        issue.name = "[Implicit Column Usage] Explicitly name columns";
        issue.key = "[Implicit Column Usage] Explicitly name columns";
        issue.message = "[Implicit Column Usage] Explicitly name columns";
        issue.severity = "LOW RISK";
        issue.description =
                "Although using wildcards and unnamed columns satisfies the goal of less"
                    + " typing,this habit creates several hazards. This can break application"
                    + " refactoring andcan harm performance. Always spell out all the columns you"
                    + " need, instead ofrelying on wild-cards or implicit column lists.[Matching"
                    + " Expression: insert into test values]";
        return issue;
    }

    private static SqlIssue getExpectedIssueForSelectStar() {
        SqlIssue issue = new SqlIssue();
        issue.fileName = "sqlCheckv1_3.sql";
        issue.isAdhoc = true;
        issue.repo = "sqlcheck";
        issue.name = "[SELECT *] Inefficiency in moving data to the consumer";
        issue.key = "[SELECT *] Inefficiency in moving data to the consumer";
        issue.message = "[SELECT *] Inefficiency in moving data to the consumer";
        issue.severity = "HIGH RISK";
        issue.description =
                "When you SELECT *, you're often retrieving more columns from the database than\r\n"
                        + "your application really needs to function. This causes more data to move"
                        + " from\r\n"
                        + "the database server to the client, slowing access and increasing load on"
                        + " your\r\n"
                        + "machines, as well as taking more time to travel across the network. This"
                        + " is\r\n"
                        + "especially true when someone adds new columns to underlying tables that"
                        + " didn't\r\n"
                        + "exist and weren't needed when the original consumers coded their data"
                        + " access.";
        return issue;
    }
}
