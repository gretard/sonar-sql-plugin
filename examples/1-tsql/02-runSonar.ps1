$baseToolsDir = "$PSScriptRoot\tools";
New-Item -ItemType Directory -Force -Path $baseToolsDir

function Start-SQLCover {
	$database = "ExampleDatabase"
	$server = ".\SQLEXPRESS01"
	$cloverDir = "$PSScriptRoot\tools\SQLCover"
	$coverageOutputDir = "$PSScriptRoot\build\sqlcoverresults"

	. "$cloverDir\SQLCover.ps1" 
	$results = Get-CoverTSql  "$cloverDir\SQLCover.dll"  "server=$server;initial catalog=$database;integrated security=sspi;" "$database " "exec tSQLt.RunAll" 
	New-Item -ItemType Directory -Force -Path $coverageOutputDir
	Export-OpenXml $results "$coverageOutputDir"
}

function Start-MsBuild {
	$dbProject = "$PSScriptRoot\src\ExampleDatabase\ExampleDatabase.sln"
	$msbuildpath = Resolve-Path "C:\Program Files*\MSBuild\*\Bin\*\MSBuild.exe" | select -ExpandProperty Path -First 1
	&$msbuildpath "$dbProject" /t:build /p:RunSqlCodeAnalysis=True
}

function Start-DotnetMsBuild {
	$dbProject = "$PSScriptRoot\src\ExampleDatabase\ExampleDatabase.sln"
	$msbuildpath = "dotnet"
	$msbuildArgs = @("msbuild", "$dbProject", "/t:build", "/p:RunSqlCodeAnalysis=True")
	Write-Output "$msbuildpath $msbuildArgs"
	&$msbuildpath $msbuildArgs
}


function Start-Sonar {
	$sqlCodeGuard = "$PSScriptRoot\tools\SQLCodeGuardCmdLine\SqlCodeGuard30.Cmd.exe"
	$sonarScanner = Resolve-Path "$PSScriptRoot\tools\sonar-scanner\*\bin\sonar-scanner.bat" | select -ExpandProperty Path -First 1

	$sonarArgs = @(
		"-Dsonar.host.url=http://localhost:9000"
		"-Dsonar.exclusions=**/bin/**/*.*,**/obj/**/*.*,**/*.sqlproj", # skip build files from analysis

		# it is possible to specify absolute path to the SQLCover report or directory where file matching *Coverage.opencoverxml resides, by default plugin will try to find it in the base directory's subdirectories
		# "-Dsonar.sql.tsql.sqlcover.report=$coverageOutputDir\Coverage.opencoverxml",

		# setting sql code guard path
		"-Dsonar.sql.tsql.cg.path=$sqlCodeGuard",
		"-X"

		# it is possible to specify absolute path to the MSBuild code analysis report or directory where file matching *StaticCodeAnalysis.Results.xml resides, by default plugin will try to find it in the base directory's subdirectories
		#"-Dsonar.sql.tsql.ms.report=$PSScriptRoot\src\ExampleDatabase\ExampleDatabase\bin\Debug"

	);
	&$sonarScanner $sonarArgs
}

## Uncomment where required

#Start-SQLCOver
#Start-MsBuild
#Start-DotnetMsBuild
Start-Sonar