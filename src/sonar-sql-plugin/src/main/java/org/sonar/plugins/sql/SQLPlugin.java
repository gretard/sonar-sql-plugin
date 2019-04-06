package org.sonar.plugins.sql;

import org.sonar.api.Plugin;
import org.sonar.api.PropertyType;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.plugins.sql.sensors.CGIssuesSensor;
import org.sonar.plugins.sql.sensors.MSIssuesSensor;
import org.sonar.plugins.sql.sensors.SQLSensor;
import org.sonar.plugins.sql.sensors.SqlCheckSensor;
import org.sonar.plugins.sql.sensors.SqlCoverCoverageSensor;

public class SQLPlugin implements Plugin {

	@Override
	public void define(Context context) {
		context.addExtension(PropertyDefinition.builder(Constants.PLUGIN_SQL_DIALECT).name("SQL dialect")
				.description("SQL dialect for analysis").defaultValue("tsql").type(PropertyType.STRING).build());

		context.addExtension(PropertyDefinition.builder(Constants.PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH)
				.name("Custom rules search path").description("Path/File to custom rules")
				.defaultValue(Constants.PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH_DEFAULT).type(PropertyType.STRING)
				.build());

		context.addExtension(PropertyDefinition.builder(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIX)
				.name("Custom rules file suffixes").description("Custom rules suffix")
				.defaultValue(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIXES_DEFAULT).type(PropertyType.STRING).build());

		context.addExtension(PropertyDefinition.builder(Constants.SQL_SQLCHECK_PATH).name("Path to SQLCheck tool")
				.description("Path to SQLCheck tool").defaultValue(Constants.SQL_SQLCHECK_PATH_DEFAULT)
				.type(PropertyType.STRING).build());

		context.addExtension(PropertyDefinition.builder(Constants.TSQL_CG_PATH).name("Path to SQLCodeGuard tool")
				.description("Path to SQLCodeGuard tool").defaultValue(Constants.TSQL_CG_PATH_DEFAULT)
				.type(PropertyType.STRING).build());

		context.addExtension(PropertyDefinition.builder(Constants.TSQL_SQLCOVER_PATH).name("Path to SQLCover report")
				.description("Path to SQLCover report").defaultValue(Constants.TSQL_SQLCOVER_PATH_DEFAULT)
				.type(PropertyType.STRING).build());

		context.addExtension(PropertyDefinition.builder(Constants.TSQL_MS_ISSUES)
				.name("File/Search suffix for MS T-SQL analysis report")
				.description("File/Search suffix for MS T-SQL analysis report")
				.defaultValue(Constants.TSQL_MS_ISSUES_DEFAULT).type(PropertyType.STRING).build());

		context.addExtensions(SQLLanguage.class, SQLRulesDefinition.class, CGRulesDefinition.class,
				MsRulesDefinition.class, SQLQualityProfile.class);
		context.addExtensions(SQLSensor.class, MSIssuesSensor.class, CGIssuesSensor.class, SqlCoverCoverageSensor.class,
				SqlCheckSensor.class);

	}

}
