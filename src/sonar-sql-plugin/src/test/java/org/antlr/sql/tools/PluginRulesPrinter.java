package org.antlr.sql.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.sql.dialects.SQLDialectRules;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class PluginRulesPrinter {
	public static void main(String[] args) {
		List<SqlRules> rules = SQLDialectRules.INSTANCE.getGroupedRules();
		List<SqlRules> rules0 = SQLDialectRules.INSTANCE.getRules();
		Map<String, SqlRules> repos = new HashMap<>();
		rules0.forEach(x -> {
			repos.put(x.getDialect(), x);
		});
		for (SqlRules rule : rules) {
			for (Rule r : rule.getRule()) {
				System.out.println("## " + r.getKey() + " - " + r.getName());

				List<String> dialects = new ArrayList<>();
				for (Entry<String, SqlRules> re : repos.entrySet()) {
					if (re.getValue().getRule().stream().anyMatch(x -> x.getKey().equals(r.getKey()))) {
						dialects.add(re.getKey());
					}
				}
				System.out.println(
						"<p>Supported dialects: " + String.join(",", dialects.toArray(new String[0])) + "</p>");
				System.out.println(r.getDescription());
				System.out.println();

			}
		}
	}
}
