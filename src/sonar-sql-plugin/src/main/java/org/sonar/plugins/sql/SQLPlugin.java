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

		context.addExtensions(SQLLanguage.class, SQLRulesDefinition.class, CGRulesDefinition.class,
				MsRulesDefinition.class, SQLQualityProfile.class);
		context.addExtensions(SQLSensor.class, MSIssuesSensor.class, CGIssuesSensor.class, SqlCoverCoverageSensor.class,
				SqlCheckSensor.class);

	}

}
