package org.sonar.plugins.sql;

import java.util.List;

import org.antlr.sql.dialects.SQLDialectRules;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class SQLRulesDefinition implements RulesDefinition {

	@Override
	public void define(Context context) {

		List<SqlRules> rules = SQLDialectRules.INSTANCE.getGroupedRules();

		for (SqlRules rulesDef : rules) {
			NewRepository repository = context.createRepository(rulesDef.getRepoKey(), Constants.languageKey)
					.setName(rulesDef.getRepoName());

			for (org.sonar.plugins.sql.models.rules.Rule rule : rulesDef.getRule()) {
				NewRule x1Rule = repository.createRule(rule.getKey()).setName(rule.getName())
						.setHtmlDescription(rule.getDescription());

				x1Rule.setActivatedByDefault(true);
			}
			repository.done();

		}

	}

}
