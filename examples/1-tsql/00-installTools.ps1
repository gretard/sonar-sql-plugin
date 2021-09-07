Add-Type -AssemblyName System.IO.Compression.FileSystem

function Uzip-File {
    param( [string]$ziparchive, [string]$extractpath )
    [System.IO.Compression.ZipFile]::ExtractToDirectory( $ziparchive, $extractpath )
}

$baseToolsDir = "$PSScriptRoot\tools";
New-Item -ItemType Directory -Force -Path $baseToolsDir

function Setup-SqlCodeGuard {
	$url = "http://download.red-gate.com/SQLCodeGuardCmdLine.zip"
	$output = "$baseToolsDir\SQLCodeGuardCmdLine.zip";
	$outputDir = "$baseToolsDir\SQLCodeGuardCmdLine"
	[Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12
	$WebClient = New-Object System.Net.WebClient
	$WebClient.DownloadFile($url,$output)
	Uzip-File -ziparchive $output -extractpath $outputDir
	Write-output "Extracted SQLCodeGuardCmdLine to $outputDir"
}

function Setup-SonarScanner {
    $url = "https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-4.6.2.2472-windows.zip"
    $output = "$baseToolsDir\scanner.zip";
	$outputDir = "$baseToolsDir\sonar-scanner"
	[Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12
	$WebClient = New-Object System.Net.WebClient
	$WebClient.DownloadFile($url,$output)
	Uzip-File -ziparchive $output -extractpath $outputDir
	Write-output "Extracted sonar-scanner to $outputDir"
}

function Setup-SQLCover {
	$url = "https://github.com/GoEddie/SQLCover/releases/download/0.4.1/SQLCOver.0.4.1.zip";
	$output = "$baseToolsDir\sqlCover.zip";
	$outputDir = "$baseToolsDir\SQLCover"
	[Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12
	$WebClient = New-Object System.Net.WebClient
	$WebClient.DownloadFile($url,$output)
	Uzip-File -ziparchive $output -extractpath $outputDir
	Write-output "Extracted SQLCover to $outputDir"

}
Setup-SqlCodeGuard
Setup-SQLCover
Setup-SonarScanner