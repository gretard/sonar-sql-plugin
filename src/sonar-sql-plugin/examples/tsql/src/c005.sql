/*compliant code*/
EXECUTE sp_executesql N'select 1';
EXECUTE sp_executesql N'select 1';
exec sys.sp_test  @test = 'Publisher';
exec sys.sp_test  @test = 'Publisher';
/*violating code*/
EXEC ('SELECT 1');
EXEC ('SELECT 1');
EXEC (@sQueryText);
EXEC (@sQueryText);
