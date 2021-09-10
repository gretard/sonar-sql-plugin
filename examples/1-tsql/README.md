# TSQL project example #
This folder contains example TSQL project and scripts allowing to setup required tools and illustrating usage of sonar-scanner with TSQL plugin.

# Usage #

Execute the following:
 1. Update if needed and run *00-installTools.ps1*. It will download and extract to tools directory SqlCodeGuard, SonarScanner and SQLClover.
 2. Update *01-executeDBChanges.ps1* with *server* name where to deploy tSQLt framework and run.
 3. Publish database from src folder.
 4. Update *server* and *sonarHost* parameters in *02-runSonar.ps1* file and run that script. 

TSQL sample project should now be visible in SonarQube server with coverage results.


dotnet new --install MSBuild.Sdk.SqlProj.Templates

# Execution

1. Update sonar-project.properties
2. Run **00-installTools.ps1**. This will download required tools
3. [Optional] Run 01-executeDBChanges.ps1 to deploy database
4. Update **02-runSonar.ps1** as required and run it.