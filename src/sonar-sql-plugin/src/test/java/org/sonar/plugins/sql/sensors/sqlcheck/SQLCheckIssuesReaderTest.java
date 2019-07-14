package org.sonar.plugins.sql.sensors.sqlcheck;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.sonar.api.utils.internal.JUnitTempFolder;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class SQLCheckIssuesReaderTest {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@org.junit.Rule
	public JUnitTempFolder temp = new JUnitTempFolder();

	@Test
	public void test() throws IOException {

		File baseFile = folder.newFile("results.txt");
		FileUtils.copyURLToFile(getClass().getResource("/external/sqlcheck.txt"), baseFile);

		SQLCheckIssuesReader sut = new SQLCheckIssuesReader();
		SqlIssuesList results = sut.read("-", baseFile);

		Assert.assertEquals(4, results.getaLLIssues().size());

	}

}
