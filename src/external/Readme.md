Grammars used:

- https://github.com/tshprecher/antlr_psql
- https://github.com/antlr/grammars-v4
- https://github.com/gretard/antlr4-grammar-vsql

Build:

- git clone https://github.com/antlr/grammars-v4.git
- git clone https://github.com/tshprecher/antlr_psql.git
- git clone https://github.com/gretard/antlr4-grammar-vsql.git
- cd grammars-v4 && git pull && cd .. 
- cd antlr_psql  && git pull && cd .. 
- cd antlr4-grammar-vsql  && git pull && cd .. 
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/sql/mysql/Positive-Technologies" -Dgrammars.package="org.antlr.sql.dialects.mysql" -Dgrammars.out.dir="mysql"
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/sql/tsql" -Dgrammars.package="org.antlr.sql.dialects.tsql" -Dgrammars.out.dir="tsql"
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/sql/postgresql" -Dgrammars.package="org.antlr.sql.dialects.psqlv2" -Dgrammars.out.dir="psqlv2"
- mvn antlr4:antlr4 -Dgrammars="grammars-v4/sql/snowflake" -Dgrammars.package="org.antlr.sql.dialects.snowflake" -Dgrammars.out.dir="snowflake"
- mvn antlr4:antlr4 -Dgrammars="antlr_psql/antlr4" -Dgrammars.package="org.antlr.sql.dialects.psqlv1" -Dgrammars.out.dir="psqlv1"
- mvn antlr4:antlr4 -Dgrammars="antlr4-grammar-vsql/antlr4-grammar-vsql/src/main/antlr4" -Dgrammars.package="org.antlr.sql.dialects.vsql" -Dgrammars.out.dir="vsql"
- mvn antlr4:antlr4 -Dgrammars="antlr4-grammar-sql-comments/src/main/antlr4" -Dgrammars.package="org.antlr.sql.dialects.comments" -Dgrammars.out.dir="comments"

