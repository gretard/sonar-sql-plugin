package org.sonar.plugins.sql;

import java.util.List;

import org.antlr.sql.dialects.SQLDialectRules;
import org.antlr.sql.dialects.rules.CommonRules;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class SQLQualityProfile implements BuiltInQualityProfilesDefinition {

	@Override
	public void define(Context context) {
		final NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("SQL rules", Constants.languageKey)
				.setDefault(true);
		final List<SqlRules> rules = SQLDialectRules.INSTANCE.getGroupedRules();
		
		for (SqlRules sqlRules : rules) {
			for (Rule rule : sqlRules.getRule()) {
				profile.activateRule(sqlRules.getRepoKey(), rule.getKey());
			}
		}
		
		

		profile.done();
	}
}