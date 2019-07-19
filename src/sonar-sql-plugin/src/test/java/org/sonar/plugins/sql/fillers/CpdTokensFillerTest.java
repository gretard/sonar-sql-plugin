package org.sonar.plugins.sql.fillers;

import java.io.File;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.cpd.internal.TokensLine;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.plugins.sql.Constants;

public class CpdTokensFillerTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void test() throws Exception {
		SensorContextTester ctxTester = SensorContextTester.create(folder.getRoot());
		ctxTester.fileSystem().setWorkDir(folder.getRoot().toPath());

		File baseFile = folder.newFile("test.sql");

		FileUtils.copyURLToFile(getClass().getResource("/tsql/sample1.sql"), baseFile);
		String contents = FileUtils.readFileToString(baseFile);

		DefaultInputFile ti = new TestInputFileBuilder("test", folder.getRoot(), baseFile).initMetadata(contents)
				.setLanguage(Constants.languageKey).setContents(contents).setProjectBaseDir(folder.getRoot().toPath())
				.build();
		ctxTester.fileSystem().add(ti);

		AntlrContext antlrContext = Dialects.TSQL.parse(FileUtils.readFileToString(baseFile));
		CpdTokensFiller filler = new CpdTokensFiller();
		filler.fill(ti, ctxTester, antlrContext);
		List<TokensLine> lines = ctxTester.cpdTokens("test:test.sql");
		Assert.assertEquals(2, lines.size());
	}

}
