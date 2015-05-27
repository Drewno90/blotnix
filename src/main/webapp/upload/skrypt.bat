@echo off
setlocal enabledelayedexpansion
::Temporay test variable
set /a str=1
for /F "delims=" %%f in ('dir /b %~1\*.jpg') do (
  set oldName=%%f
  set newName=!str!
  set /a str=str+1
  ren "%~1\!oldName!" "!newName!.jpg"
)
endlocal