Add-Type -AssemblyName System.IO.Compression.FileSystem
function Uzip-File {
    param( [string]$ziparchive, [string]$extractpath )
    [System.IO.Compression.ZipFile]::ExtractToDirectory( $ziparchive, $extractpath )
}

$baseToolsDir = "$PSScriptRoot\tools";
$tsqltDir = "$PSScriptRoot\tools\TSQLT"


$server = ".\SQLEXPRESS01"
$database = "ExampleDatabase"

function Setup-TSQLT {
	$url = "https://tsqlt.org/download/tsqlt/";
	$output = "$baseToolsDir\tsqlt.zip";
	[Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12
	$WebClient = New-Object System.Net.WebClient
	$WebClient.DownloadFile($url,$output)
	Uzip-File -ziparchive $output -extractpath $tsqltDir
}

Setup-TSQLT

&sqlcmd -S $server -i "$tsqltDir\SetClrEnabled.sql"
&sqlcmd -S $server -Q "EXEC sp_configure 'show advanced options', 1; RECONFIGURE; EXEC sp_configure 'clr strict security', 0; RECONFIGURE;"
&sqlcmd -S $server -Q "CREATE DATABASE $database;"
&sqlcmd -S $server -d $database -i "$tsqltDir\tSQLt.class.sql"
return