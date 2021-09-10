git clone https://github.com/microsoft/sql-server-samples.git
$baseDir = "$PSScriptRoot";
Copy-Item -Path "$baseDir\sql-server-samples" -Filter "*.sql" -Destination "$baseDir\src" -Recurse