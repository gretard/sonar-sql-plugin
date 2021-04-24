# sonar-sql-plugin
[![Gitter](https://badges.gitter.im/sonar-sql-plugin/community.svg)](https://gitter.im/sonar-sql-plugin/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![Build Status](https://dev.azure.com/kgreta/sonar-sql-plugin/_apis/build/status/gretard.sonar-sql-plugin?branchName=master)](https://dev.azure.com/kgreta/sonar-sql-plugin/_build/latest?definitionId=2&branchName=master)

  SQL language (T-SQL, MySQL, PostgreSQL and Vertica SQL dialects) plugin for [SonarQube](https://www.sonarqube.org/) 

## Donating ##
You can support this [project and others](https://github.com/gretard) via [Paypal](https://www.paypal.me/greta514284/)

[![Support via PayPal](https://cdn.rawgit.com/twolfson/paypal-github-button/1.0.0/dist/button.svg)](https://www.paypal.me/greta514284/)

## Description ##
Currently plug-in supports:
- Several SQL dialects by using ANTLR4 grammars:
  - [TSQL](https://github.com/antlr/grammars-v4/tree/master/sql/tsql)
  - [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql/Positive-Technologies)
  - [PostgreSQL](https://github.com/tshprecher/antlr_psql)
- Reporting of issues found by:
  - [SQLCodeGuard](https://www.red-gate.com/products/sql-development/sql-code-guard/index) 
  - [MSBuild](https://msdn.microsoft.com/en-us/library/dd172133(v=vs.100).aspx)
  - [SQLCheck](https://github.com/jarulraj/sqlcheck)
  - Custom rules reported by [plugin](https://github.com/gretard/sonar-sql-plugin/blob/master/docs/pluginRules.md)
- Reporting of code coverage calculated by [SQLCover](https://github.com/GoEddie/SQLCover)
- Lines and comment lines measures reporting
- Cognitive and cyclomatic complexity metrics reporting
- Custom user rules. Configuration can be found at [here](https://github.com/gretard/sonar-sql-plugin/blob/master/docs/customRulesSetup.md)

## Tutorials ##
Tutorials:
- [Integrating Redgate SQL Code Guard with SonarQube](https://www.red-gate.com/hub/product-learning/sql-change-automation/integrating-redgate-sql-code-guard-with-sonarqube)

## Requirements ##
Different plugin versions supports the following:
- 1.0.0 - Sonarqube 7.4+versions

## Installation ##
1. Download and install SonarQube
2. Download plugin from the [releases](https://github.com/gretard/sonar-sql-plugin/releases) and copy it to sonarqube's extensions\plugins directory
3. Start SonarQube and enable rules
4. [TSQL] (Optional) Install [SQLCodeGuard](https://www.red-gate.com/products/sql-development/sql-code-guard/index) into your build machine where you plan to run sonar scanner
5. [TSQL, MySQL, PotsgreSQL] (Optional) - Install [SQLCheck](https://github.com/jarulraj/sqlcheck) into your build machine where you plan to run sonar scanner
6. [TSQL] (Optional) Setup SQLCover reorting. You can check tsql example at here for full setup.

## Getting started ###
Please see examples on how to use different dialects.

### T-SQL ###
Sonar settings for tsql. You can check example at [here](https://github.com/gretard/sonar-sql-plugin/tree/master/examples/1-tsql)
```
sonar.projectKey=examples.sql.mysql.project
sonar.projectName=examples.sql.mysql.project
sonar.projectVersion=1.1
sonar.sources=src
# optional
sonar.language=sql
# optional as plugin defaults to tsql
sonar.sql.dialect=tsql

```

### PostgreSQL ###
Sonar settings for pssql. You can check example at [here](https://github.com/gretard/sonar-sql-plugin/tree/master/examples/2-psql)
```
sonar.projectKey=examples.sql.mysql.project
sonar.projectName=examples.sql.mysql.project
sonar.projectVersion=1.1
sonar.sources=src
# optional
sonar.language=sql
sonar.sql.dialect=pssql
```

### MySQL ###
Sonar settings for mysql. You can check example at [here](https://github.com/gretard/sonar-sql-plugin/tree/master/examples/3-msql)
```
sonar.projectKey=examples.sql.mysql.project
sonar.projectName=examples.sql.mysql.project
sonar.projectVersion=1.1
sonar.sources=src
# optional
sonar.language=sql
sonar.sql.dialect=mysql
```
## Plugin configuration ##
The following options are available for configuration:

- **sonar.sql.dialect** - SQL dialect for analysis. *Defaults to tsql*. Supported values are : tsql, mysql, pssql
- **sonar.sql.rules.path** - path to custome rules, can be directory or absolute file. *Defaults to .*. Multiple values are supported.
- **sonar.sql.rules.suffix** - custom rules suffix
- **sonar.sql.tsql.ms.report** - suffix to search path directories for MSBuild report. *Defaults to staticcodeanalysis.results.xml*. Can be absolute or relative
- **sonar.sql.sqlcheck.path** - Path to SQLCheck tool. *Defaults to /usr/bin/sqlcheck*
- **sonar.sql.tsql.cg.path** - Path to CodeGuard tool. *Defaults to C:\Program Files\SQLCodeGuardCmdLine\SqlCodeGuard30.Cmd.exe*
- **sonar.sql.tsql.sqlcover.report** - path to SQLCover report. Can be absolute or suffix to search in base dir. *Defaults to Coverage.opencoverxml*.
- **sonar.sql.file.suffixes** - file suffixes which will be reported belonging to SQL langauge. *Defaults to .sql*
- **sonar.sql.sca.timeout** - timeout value for static code analysis done by plugin in seconds. *Defaults to 3600*
- **sonar.sql.sca.maxfilesize** - limit in bytes for files to be analyzed by plugin. *Defaults to 2097152*
- **sonar.sql.rules.skip** - comma separated list of repoKey:ruleId pairs to select rules which will not be reported by the plugin, i.e. tsql-cg:ST008
