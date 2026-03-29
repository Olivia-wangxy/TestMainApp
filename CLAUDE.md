# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an Android multi-module project using Kotlin with Jetpack Compose. It consists of:
- `app` - Main application module
- `android-commonui` - Common UI library module providing shared components

## Common Commands

```bash
# Build
./gradlew assembleDebug          # Build debug APK
./gradlew assembleRelease        # Build release APK
./gradlew :app:assembleDebug     # Build specific module

# Testing
./gradlew test                   # Run unit tests
./gradlew connectedAndroidTest   # Run instrumented tests (requires device/emulator)

# Development
./gradlew clean                  # Clean build
./gradlew dependencies           # View dependencies
```

## Architecture

- **Multi-module structure**: `app` (application) depends on `android-commonui` (library)
- **UI Framework**: Jetpack Compose with Material3
- **Build System**: Gradle 8.13 with Kotlin DSL
- **Min SDK**: 24, **Target/Compile SDK**: 36