package org.antlr.sql.dialects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.sql.dialects.rules.MySQLRules;
import org.antlr.sql.dialects.rules.PSSQLRules;
import org.antlr.sql.dialects.rules.TSQLRules;
import org.antlr.sql.dialects.rules.VSQLRules;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public enum SQLDialectRules {
    INSTANCE;

    public List<SqlRules> getRules() {
        List<SqlRules> rules = new ArrayList<>();

        {

            rules.addAll(TSQLRules.INSTANCE.getRules());
        }
        {
            rules.addAll(MySQLRules.INSTANCE.getRules());
        }
        {
            rules.addAll(PSSQLRules.INSTANCE.getRules());
        }

        {
            rules.addAll(VSQLRules.INSTANCE.getRules());
        }
        return rules;
    }

    public List<SqlRules> getGroupedRules() {
        Map<String, Rule> rules = new TreeMap<>();

        getRules().forEach(sqlRules -> {
            sqlRules.getRule().forEach(rule -> {
                String key = rule.getKey();
                if (!rules.containsKey(key)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(rule.getDescription());
                    if (!rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample().isEmpty()
                            || !rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
                                    .isEmpty()) {
                        sb.append("<h2>Code examples</h2>");
                        if (!rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                                .isEmpty()) {
                            sb.append("<h3>Non-compliant</h3>");
                            for (String x : rule.getRuleImplementation().getViolatingRulesCodeExamples()
                                    .getRuleCodeExample()) {
                                sb.append("<pre><code>" + x + "</code></pre>");
                            }
                        }

                        if (!rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
                                .isEmpty()) {
                            sb.append("<h3>Compliant</h3>");
                            for (String x : rule.getRuleImplementation().getCompliantRulesCodeExamples()
                                    .getRuleCodeExample()) {
                                sb.append("<pre><code>" + x + "</code></pre>");
                            }
                        }
                    }
                    rule.setDescription(sb.toString());
                    rules.put(key, rule);
                }

            });

        });
        SqlRules customRules = new SqlRules();
        customRules.setRepoKey("SQLCC");
        customRules.setRepoName("SQL Plugin checks");
        customRules.getRule().addAll(rules.values());
        return Arrays.asList(customRules);
    }
}
