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
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.internal.JUnitTempFolder;
import org.sonar.plugins.sql.Constants;

@RunWith(Parameterized.class)
public class HighlightingFillerTest {

	HighlighterFiller filler = new HighlighterFiller();

	@Parameters(name = "{0} ({index})")
	public static Iterable<Object[]> data() throws Throwable {

		List<Object[]> data = new ArrayList<>();

		data.add(new Object[] { Dialects.MYSQL, 17 });
		data.add(new Object[] { Dialects.PSSQL, 7 });
		data.add(new Object[] { Dialects.TSQL, 9 });

		data.add(new Object[] { Dialects.VSQL, 9 });
		return data;
	}

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@org.junit.Rule
	public JUnitTempFolder temp = new JUnitTempFolder();

	private Dialects dialect;

	private int expected;

	public HighlightingFillerTest(Dialects dialect, int expected) {
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

		AntlrContext antlrContext = dialect.parse("SELECT * From facts.test where name = 4;\r\n");

		PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);

		filler.fill(ti, ctxTester, antlrContext);
		List<TypeOfText> res = ctxTester.highlightingTypeAt("test:test.sql", 1, 1);
		Assert.assertEquals(1, res.size());
		Assert.assertEquals("KEYWORD", res.get(0).name());

	}

}
