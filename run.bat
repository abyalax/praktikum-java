@echo off
:: =====================================================
::  Auto Compile & Run Java Program (Clean version)
::  Usage: run <NamaFileTanpaExt>
::  Example: run Main
:: =====================================================

if "%~1"=="" (
    echo Usage: run ^<MainClass^>
    exit /b
)

set CLASS=%~1

@REM echo Compiling %CLASS%.java ...
javac %CLASS%.java

if %ERRORLEVEL% neq 0 (
    echo Compilation failed!
    exit /b
)

@REM echo Running %CLASS% ...
java %CLASS%

:: Hapus file hasil compile (.class)
if exist "%CLASS%.class" (
    del "%CLASS%.class"
    @REM echo Removed compiled file: %CLASS%.class
)
