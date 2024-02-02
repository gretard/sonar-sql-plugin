package org.antlr.sql.tools;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.antlr.sql.dialects.SQLDialectRules;
import org.apache.commons.io.FileUtils;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class TestFilesGenerator {

    public static void main(String[] args) {
        List<SqlRules> rules = SQLDialectRules.INSTANCE.getRules();

        for (SqlRules rule : rules) {
            String dir = rule.getDialect() == null ? "other" : rule.getDialect();
            if (dir == null) {
                dir = "other";
            }
            dir = "./examples/" + dir.toLowerCase() + "/src";

            for (Rule r : rule.getRule()) {
                StringBuilder sb = new StringBuilder();
                sb.append("/*compliant code*/\r\n");
                r.getRuleImplementation()
                        .getCompliantRulesCodeExamples()
                        .getRuleCodeExample()
                        .forEach(
                                line -> {
                                    sb.append(line);
                                    sb.append("\r\n");
                                    sb.append(line);
                                    sb.append("\r\n");
                                });
                sb.append("/*violating code*/\r\n");
                r.getRuleImplementation()
                        .getViolatingRulesCodeExamples()
                        .getRuleCodeExample()
                        .forEach(
                                line -> {
                                    sb.append(line);
                                    sb.append("\r\n");
                                    sb.append(line);
                                    sb.append("\r\n");
                                });
                File outFile = new File(dir, r.getKey().toLowerCase() + ".sql");
                try {
                    FileUtils.write(outFile, sb.toString(), StandardCharsets.UTF_8);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
