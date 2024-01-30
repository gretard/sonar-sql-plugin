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
        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_DIALECT)
                        .name("SQL dialect")
                        .description("SQL dialect for analysis")
                        .defaultValue("tsql")
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH)
                        .name("Custom rules search path")
                        .description("Path/File to custom rules")
                        .multiValues(true)
                        .defaultValue(Constants.PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());
        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_RULES_SKIP)
                        .name("Skipped rules")
                        .description(
                                "List of 'repo:ruleKey' keys of repo:key of rules to skip"
                                        + " reporting, i.e. tsql-cg:ST008")
                        .multiValues(true)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIX)
                        .name("Custom rules file suffixes")
                        .description("Custom rules suffix")
                        .defaultValue(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIXES_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.SQL_SQLCHECK_PATH)
                        .name("Path to SQLCheck tool")
                        .description("Path to SQLCheck tool")
                        .defaultValue(Constants.SQL_SQLCHECK_PATH_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.TSQL_CG_PATH)
                        .name("Path to SQLCodeGuard tool")
                        .description("Path to SQLCodeGuard tool")
                        .defaultValue(Constants.TSQL_CG_PATH_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.TSQL_SQLCOVER_PATH)
                        .name("Path to SQLCover report")
                        .description("Path to SQLCover report")
                        .defaultValue(Constants.TSQL_SQLCOVER_PATH_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.TSQL_MS_ISSUES)
                        .name("File/Search suffix for MS T-SQL analysis report")
                        .description("File/Search suffix for MS T-SQL analysis report")
                        .defaultValue(Constants.TSQL_MS_ISSUES_DEFAULT)
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SUFFIXES)
                        .name("File suffixes")
                        .description(
                                "File suffixes which will be reported belonging to SQL language")
                        .multiValues(true)
                        .defaultValue(".sql")
                        .type(PropertyType.STRING)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_SCA_TIMEOUT)
                        .name("SCA timeout")
                        .description(
                                "Timeout value for full code analysis done by plugin in seconds")
                        .defaultValue(Constants.PLUGIN_SQL_SCA_TIMEOUT_DEFAULT + "")
                        .type(PropertyType.INTEGER)
                        .build());

        context.addExtension(
                PropertyDefinition.builder(Constants.PLUGIN_SQL_SCA_MAX_FILE_SIZE)
                        .name("SCA file size limit")
                        .description("Limit in bytes for files to be analyzed by plugin")
                        .defaultValue(Constants.PLUGIN_SQL_SCA_MAX_FILE_SIZE_DEFAULT + "")
                        .type(PropertyType.INTEGER)
                        .build());

        context.addExtensions(
                SQLLanguage.class,
                SQLRulesDefinition.class,
                MsRulesDefinition.class,
                SQLQualityProfile.class);
        context.addExtensions(
                SQLSensor.class,
                MSIssuesSensor.class,
                CGIssuesSensor.class,
                SqlCoverCoverageSensor.class,
                SqlCheckSensor.class);
    }
}
