Grammars used:

- https://github.com/tshprecher/antlr_psql
- https://github.com/antlr/grammars-v4

Build:
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/mysql/Positive-Technologies" -Dgrammars.package="org.antlr.sql.dialects.mysql" -Dgrammars.out.dir="mysql"
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/tsql" -Dgrammars.package="org.antlr.sql.dialects.tsql" -Dgrammars.out.dir="tsql"
- mvn antlr4:antlr4 -Dgrammars="antlr_psql/antlr4" -Dgrammars.package="org.antlr.sql.dialects.psql" -Dgrammars.out.dir="psql"