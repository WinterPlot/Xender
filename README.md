# XShare — Open Source File Sharing for Android

**XShare is free and open-source software**, licensed under the [MIT License](LICENSE).
You can read, modify, build and redistribute it under the terms of that license.

- Package: `com.userlabs.xshare`
- License: MIT (see `LICENSE`)
- Third-party libraries keep their own licenses.
- Contributions are welcome — fork the project, make your change and open a pull request.

---

# XShare 19.0.0 Prime — Reorganized Decompiled Project

This archive reorganizes the JADX output into a conventional Android Gradle project layout.

## Directory mapping
- `app/src/main/java/` — recovered Java source files (including Java reconstructed from Kotlin bytecode)
- `app/src/main/res/` — decoded Android resources and XML
- `app/src/main/assets/` — APK assets
- `app/src/main/jniLibs/` — native `.so` libraries grouped by ABI
- `app/src/main/AndroidManifest.xml` — decoded manifest
- `recovered-metadata/` — preserved META-INF, Kotlin metadata/resources and other extracted root files

## Important limitations
- JADX reported 12 decompilation errors; some classes may be incomplete or incorrect.
- This is not XShare's original source project. Original Gradle configuration, dependency declarations, signing configuration, and comments were not recovered from the APK.
- `settings.gradle` and Gradle build files are a minimal scaffold only. Compilation may fail until missing dependencies and decompiler issues are repaired.
- Use only where you have authorization to inspect or modify the app.
