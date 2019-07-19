package org.sonar.plugins.sql;

public final class Constants {
	public static final String languageKey = "sql";

	public static final String PLUGIN_SQL_DIALECT = "sonar.sql.dialect";

	public static final String PLUGIN_SQL_SCA_TIMEOUT = "sonar.sql.sca.timeout";

	public static final long PLUGIN_SQL_SCA_TIMEOUT_DEFAULT = 3600l;

	public static final String PLUGIN_SUFFIXES = "sonar.sql.file.suffixes";

	public static final String PLUGIN_SQL_EXTERNAL_RULES_SUFFIX = "sonar.sql.rules.suffixes";

	public static final String PLUGIN_SQL_RULES_SKIP= "sonar.sql.rules.skip";
	
	public static final String PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH = "sonar.sql.rules.path";

	public static final String PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH_DEFAULT = ".";

	public static final String PLUGIN_SQL_EXTERNAL_RULES_SUFFIXES_DEFAULT = ".customRules";

	public static final String TSQL_MS_ISSUES = "sonar.sql.tsql.ms.report";

	public static final String TSQL_MS_ISSUES_DEFAULT = "staticcodeanalysis.results.xml";

	public static final String TSQL_MS_REPO_KEY = "tsql-ms";

	public static final String TSQL_MS_ENGINEID = "tsql-ms";

	public static final String TSQL_CG_ENGINEID = "tsql-cg";

	public static final String TSQL_CG_PATH_DEFAULT = "C:\\Program Files\\SQLCodeGuardCmdLine\\SqlCodeGuard40.Cmd.exe";

	public static final String TSQL_CG_PATH = "sonar.sql.tsql.cg.path";

	public static final String TSQL_SQLCOVER_PATH = "sonar.sql.tsql.sqlcover.report";

	public static final String TSQL_SQLCOVER_PATH_DEFAULT = "Coverage.opencoverxml";

	public static final String SQL_SQLCHECK_ENGINEID = "sqlcheck";

	public static final String SQL_SQLCHECK_PATH = "sonar.sql.sqlcheck.path";

	public static final String SQL_SQLCHECK_PATH_DEFAULT = "/usr/bin/sqlcheck";

	public static final String PLUGIN_SQL_SCA_MAX_FILE_SIZE = "sonar.sql.sca.maxfilesize";

	public static final long PLUGIN_SQL_SCA_MAX_FILE_SIZE_DEFAULT = 1024 * 1024 * 2;

}
