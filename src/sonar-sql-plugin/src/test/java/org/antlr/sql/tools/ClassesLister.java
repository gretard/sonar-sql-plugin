package org.antlr.sql.tools;

import com.google.common.reflect.ClassPath;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import org.apache.commons.io.FileUtils;

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

        List<ListData> data =
                Arrays.asList(
                        new ListData("TSQL", "org.antlr.sql.dialects.tsql.TSqlParser$"),
                        new ListData("PSSQL", "org.antlr.sql.dialects.psql.PostgreSQLParser$"),
                        new ListData("MySQL", "org.antlr.sql.dialects.mysql.MySqlParser$"),
                        new ListData("VSQL", "org.antlr.sql.dialects.vsql.VSqlParser$"),
                        new ListData("PSSQLV2", "org.antlr.sql.dialects.psqlv2.PostgreSQLParser$"),
                        new ListData(
                                "SNOWFLAKE", "org.antlr.sql.dialects.snowflake.SnowflakeParser$"));

        final ClassLoader loader = Thread.currentThread().getContextClassLoader();

        for (ListData dataItem : data) {
            TreeSet<String> set = new TreeSet<>();
            for (final ClassPath.ClassInfo info : ClassPath.from(loader).getAllClasses()) {
                if (info.getName().startsWith(dataItem.packageName)) {
                    set.add("- " + info.getSimpleName());
                }
            }

            File outFile =
                    new File("./../../docs/" + dataItem.dialect.toLowerCase() + "Classes.md");
            outFile.delete();
            FileUtils.writeLines(
                    outFile, Arrays.asList("# " + dataItem.dialect, "Supported classes:"), true);
            FileUtils.writeLines(outFile, set, true);
            System.out.println(
                    "Written: " + outFile.getCanonicalFile().getAbsolutePath() + " " + set.size());
        }
    }
}
