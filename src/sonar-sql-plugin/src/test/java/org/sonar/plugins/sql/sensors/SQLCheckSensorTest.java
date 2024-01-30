package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
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
import org.sonar.plugins.sql.Constants;

public class SQLCheckSensorTest {

    @Rule public TemporaryFolder folder = new TemporaryFolder();

    @org.junit.Rule public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    @Test
    public void testExecute() throws IOException {

        Assume.assumeTrue("Tool exists", new File(Constants.SQL_SQLCHECK_PATH_DEFAULT).exists());
        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.fileSystem().setWorkDir(folder.getRoot().toPath());

        File baseFile = folder.newFile("sample2.sql");

        FileUtils.copyURLToFile(getClass().getResource("/tsql/sample1.sql"), baseFile);
        String contents = new String(Files.readAllBytes(baseFile.toPath()));

        DefaultInputFile ti =
                new TestInputFileBuilder("test", folder.getRoot(), baseFile)
                        .initMetadata(contents)
                        .setLanguage(Constants.languageKey)
                        .setContents(contents)
                        .setProjectBaseDir(folder.getRoot().toPath())
                        .build();
        ctxTester.fileSystem().add(ti);

        SqlCheckSensor s = new SqlCheckSensor(temp);
        s.execute(ctxTester);

        Assert.assertEquals(3, ctxTester.allExternalIssues().size());
        Assert.assertEquals(0, ctxTester.allIssues().size());
        Assert.assertEquals(3, ctxTester.allAdHocRules().size());
    }
}
