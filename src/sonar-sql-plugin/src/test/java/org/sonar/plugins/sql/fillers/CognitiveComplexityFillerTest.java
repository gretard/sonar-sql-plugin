package org.sonar.plugins.sql.fillers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.tools.PrettyPrinter;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.impl.utils.JUnitTempFolder;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.plugins.sql.Constants;

@RunWith(Parameterized.class)
public class CognitiveComplexityFillerTest {

    CognitiveComplexityFiller filler = new CognitiveComplexityFiller();

    @Parameters(name = "{0} ({index})")
    public static Iterable<Object[]> data() throws Throwable {

        List<Object[]> data = new ArrayList<>();
        data.add(new Object[] { Dialects.MYSQL, 23 });
        data.add(new Object[] { Dialects.PSSQL, 15 });
        data.add(new Object[] { Dialects.TSQL, 19 });
        data.add(new Object[] { Dialects.VSQL, 13 });

        return data;
    }

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @org.junit.Rule
    public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    private Dialects dialect;

    private int expected;

    public CognitiveComplexityFillerTest(Dialects dialect, int expected) {
        this.dialect = dialect;
        this.expected = expected;
    }

    @Test
    public void testComplexity() throws IOException {
        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.fileSystem().setWorkDir(folder.getRoot().toPath());

        File baseFile = folder.newFile("test.sql");

        FileUtils.copyURLToFile(getClass().getResource("/tsql/sample1.sql"), baseFile);
        String contents = new String(Files.readAllBytes(baseFile.toPath()));

        DefaultInputFile ti = new TestInputFileBuilder("test", folder.getRoot(), baseFile).initMetadata(contents)
                .setLanguage(Constants.languageKey).setContents(contents).setProjectBaseDir(folder.getRoot().toPath())
                .build();
        ctxTester.fileSystem().add(ti);

        AntlrContext antlrContext = dialect.parse(
                "SELECT case when t1.a = 2 then 1 else 0 end as x,  now(), 1 from dbo.test as t1 left join dbo.test2 on t1.id = t2.id and t1.n = t2.n left join dbo.test as t3 on t1.id = t3.id"
                        + " WHERE t1.name = 'aa' and t2.name = 'bb' " + " GROUP by t1.id, t2.name"
                        + " HAVING COUNT(*) > 1 union all select * from dbo.test ORDER BY 1, 2;\r\n INSERT INTO dbo.test(a,b) VALUES (1,2);\r\n"
                        + " DELETE  FROM dbo.test; \r\n TRUNCATE TABLE x; \r\n UPDATE dbo.test set id = 1 where x = 4 and u = 10;\r\n");

        PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

        filler.fill(ti, ctxTester, antlrContext);

        int cg = ctxTester.measure("test:test.sql", CoreMetrics.COGNITIVE_COMPLEXITY).value();
        Assert.assertEquals("Complexity differs", expected, cg);

    }

}
