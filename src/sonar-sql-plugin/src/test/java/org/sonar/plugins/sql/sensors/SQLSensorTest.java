package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
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

public class SQLSensorTest {
    @Rule public TemporaryFolder folder = new TemporaryFolder();

    @org.junit.Rule public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    @SuppressWarnings("deprecation")
    @Test
    public void test() throws IOException {
        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.settings().setProperty("sql.dialect", "tsql");
        File baseFile = folder.newFile("test.sql");
        FileUtils.copyURLToFile(getClass().getResource("/tsql/sample1.sql"), baseFile);

        String contents = new String(Files.readAllBytes(baseFile.toPath()));
        DefaultInputFile ti =
                new TestInputFileBuilder("test", "test.sql")
                        .initMetadata(contents)
                        .setContents(contents)
                        .setLanguage(Constants.languageKey)
                        .build();
        ctxTester.fileSystem().add(ti);

        SQLSensor s = new SQLSensor();
        s.execute(ctxTester);
        Assert.assertEquals(2, ctxTester.allIssues().size());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testPsSQL() throws IOException {
        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.settings().setProperty(Constants.PLUGIN_SQL_DIALECT, "pssql");
        File baseFile = folder.newFile("test.sql");
        FileUtils.copyURLToFile(getClass().getResource("/pssql/sample1.sql"), baseFile);

        String contents = new String(Files.readAllBytes(baseFile.toPath()));
        DefaultInputFile ti =
                new TestInputFileBuilder("test", "test.sql")
                        .initMetadata(contents)
                        .setContents(contents)
                        .setLanguage(Constants.languageKey)
                        .build();
        ctxTester.fileSystem().add(ti);

        SQLSensor s = new SQLSensor();
        s.execute(ctxTester);

        Assert.assertEquals(3, ctxTester.allIssues().size());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testMySQL() throws IOException {
        SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
        ctxTester.settings().setProperty(Constants.PLUGIN_SQL_DIALECT, "mysql");
        File baseFile = folder.newFile("test.sql");
        FileUtils.copyURLToFile(getClass().getResource("/mysql/sample1.sql"), baseFile);

        String contents = new String(Files.readAllBytes(baseFile.toPath()));
        DefaultInputFile ti =
                new TestInputFileBuilder("test", "test.sql")
                        .initMetadata(contents)
                        .setContents(contents)
                        .setLanguage(Constants.languageKey)
                        .build();
        ctxTester.fileSystem().add(ti);

        SQLSensor s = new SQLSensor();
        s.execute(ctxTester);

        Assert.assertEquals(3, ctxTester.allIssues().size());
        Assert.assertEquals(0, ctxTester.allExternalIssues().size());
        Assert.assertEquals(0, ctxTester.allAdHocRules().size());
    }
}
