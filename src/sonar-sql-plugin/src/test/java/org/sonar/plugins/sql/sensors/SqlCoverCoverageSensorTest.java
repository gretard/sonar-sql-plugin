package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.impl.utils.JUnitTempFolder;
import org.sonar.plugins.sql.Constants;

public class SqlCoverCoverageSensorTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @org.junit.Rule
    public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    @Test
    public void testExecute() throws IOException {

        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.fileSystem().setWorkDir(folder.getRoot().toPath());

        File baseFile = folder.newFile("sample2.sql");

        File resFile = folder.newFile("Coverage.opencoverxml");

        FileUtils.write(resFile,

                "<CoverageSession xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n"
                        + " <Modules><Module>" + "<Classes>\r\n" + "<Class>\r\n" + "<Summary/>\r\n"
                        + "<FullName>sample2</FullName><Methods>		\r\n" + "<Method>\r\n" + "<Summary />\r\n"
                        + "<SequencePoints>\r\n"
                        + "			<SequencePoint vc=\"1\" uspid=\"1\" ordinal=\"1\" offset=\"112\" sl=\"1\" sc=\"2\" el=\"8\" ec=\"59\" />\r\n"
                        + "			<SequencePoint vc=\"0\" uspid=\"2\" ordinal=\"2\" offset=\"178\" sl=\"2\" sc=\"2\" el=\"10\" ec=\"22\" />\r\n"
                        + "			<SequencePoint vc=\"0\" uspid=\"3\" ordinal=\"3\" offset=\"204\" sl=\"3\" sc=\"4\" el=\"11\" ec=\"12\" />\r\n"
                        + "			<SequencePoint vc=\"0\" uspid=\"4\" ordinal=\"4\" offset=\"219\" sl=\"4\" sc=\"2\" el=\"13\" ec=\"10\" />\r\n"
                        + "		</SequencePoints>\r\n" + "		</Method>\r\n" + "</Methods>\r\n"
                        + "</Class></Classes>\r\n" + " </Module></Modules>" + "</CoverageSession>",
                Charset.defaultCharset());

        FileUtils.copyURLToFile(getClass().getResource("/tsql/sample2.sql"), baseFile);
        String contents = new String(Files.readAllBytes(baseFile.toPath()));

        DefaultInputFile ti = new TestInputFileBuilder("test", folder.getRoot(), baseFile).initMetadata(contents)
                .setLanguage(Constants.languageKey).setContents(contents).build();
        ctxTester.fileSystem().add(ti);
        SqlCoverCoverageSensor s = new SqlCoverCoverageSensor();
        s.execute(ctxTester);
        Assert.assertEquals(1, (int) ctxTester.lineHits("test:sample2.sql", 1));
        Assert.assertEquals(0, (int) ctxTester.lineHits("test:sample2.sql", 2));

    }

}
