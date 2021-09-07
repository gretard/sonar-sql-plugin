package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.impl.utils.JUnitTempFolder;
import org.sonar.api.utils.log.LogTester;
import org.sonar.plugins.sql.Constants;

public class MSIssuesSensorTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public LogTester logTester = new LogTester();

    @Rule
    public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    @Test
    public void testExecute() throws IOException {
        Assume.assumeFalse("OS not mac", System.getProperty("os.name").toLowerCase().indexOf("mac") >= 0);

        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.fileSystem().setWorkDir(folder.getRoot().toPath());

        File baseFile = folder.newFile("sample2.sql");

        File resFile = folder.newFile("staticcodeanalysis.results.xml");

        FileUtils.write(resFile,
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + "<Problems>" + "<Problem>" + "<Line>1</Line>"
                        + "<Rule>S1</Rule>" + "<ProblemDescription>Test</ProblemDescription>"
                        + "<Severity>MAJOR</Severity>"

                        + "<SourceFile>" + baseFile.getAbsolutePath() + "</SourceFile>" + "</Problem></Problems>",
                Charset.defaultCharset());

        FileUtils.copyURLToFile(getClass().getResource("/tsql/sample2.sql"), baseFile);
        String contents = new String(Files.readAllBytes(baseFile.toPath()));

        DefaultInputFile ti = new TestInputFileBuilder("test", folder.getRoot(), baseFile).initMetadata(contents)
                .setLanguage(Constants.languageKey).setContents(contents).build();
        ctxTester.fileSystem().add(ti);
        MSIssuesSensor s = new MSIssuesSensor();
        s.execute(ctxTester);
        Assert.assertEquals(1, ctxTester.allExternalIssues().size());
        Assert.assertEquals(0, ctxTester.allIssues().size());
        Assert.assertEquals(0, ctxTester.allAdHocRules().size());
    }

}
