package org.antlr.sql.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.FileUtils;
import org.sonar.api.internal.google.common.reflect.ClassPath;

public class ClassesLister {

	private static class ListData {
		public String dialect;
		public String packageName;

		public ListData(String dialect, String packageName) {
			this.dialect = dialect;
			this.packageName = packageName;

		}

	}

	public static void main(String[] args) throws IOException {

		List<ListData> data = Arrays.asList(new ListData("TSQL", "org.antlr.sql.dialects.tsql.TSqlParser$"),
				new ListData("PSSQL", "org.antlr.sql.dialects.psql.PostgreSQLParser$"),
				new ListData("MySQL", "org.antlr.sql.dialects.mysql.MySqlParser$"));
		final ClassLoader loader = Thread.currentThread().getContextClassLoader();

		for (ListData dataItem : data) {
			TreeSet<String> set = new TreeSet<>();
			for (final ClassPath.ClassInfo info : ClassPath.from(loader).getAllClasses()) {
				if (info.getName().startsWith(dataItem.packageName)) {
					set.add("- " + info.getSimpleName());
				}
			}

			File outFile = new File("./../../docs/" + dataItem.dialect.toLowerCase() + "Classes.md");
			outFile.delete();
			FileUtils.writeLines(outFile, Arrays.asList("# " + dataItem.dialect, "Supported classes:"), true);
			FileUtils.writeLines(outFile, set, true);
			System.out.println("Written: " + outFile.getCanonicalFile().getAbsolutePath() + " " + set.size());
		}

	}

}
