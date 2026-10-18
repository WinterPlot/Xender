# XShare recovered tree — build status

Verified only with plain `javac` (no Android SDK / Maven access in the recovery sandbox), so
android.* errors cannot be judged. Run `gradle :app:assembleDebug` on a machine with the SDK.

## Fixed
- 82 R8 stand-ins for JDK/Android classes (`java.*`, `android.*`) moved to `recovered-metadata/removed-framework-stubs/`.
- App `com/userlabs/xshare/R.java` moved to `recovered-metadata/removed-app-R/` (AGP generates it from `res/`).
- Manifest: removed `package=`, `platformBuildVersion*`, `compileSdkVersion*`, `<uses-sdk>` (AGP 8 rejects/ignores them).
- Syntax errors in ~25 files (empty imports, `??` vars, broken enums, interface static blocks).
- Constructors with code before `this()/super()` (6 files); `defpackage.a` and `androidx.camera.camera2.pipe.w` string/math helpers rebuilt.
- `app/build.gradle`: stubs source dir, multidex, Java 17, lint non-fatal.
- Duplicate bridge `next()` methods removed (22 files); inner classes using outer type vars made non-static; stub type-parameter counts corrected.
- 737 stub classes generated in `app/src/stubs/java` (all 88 listed app classes plus ~650 others). Regenerate with
  `python3 tools/gen_stubs.py .`; registry in `tools/stub_registry.json`. Stubs are no-ops.

## Remaining (needs re-decompile, ideally with the R8 mapping)
- ~1,000 genuine javac errors (the rest of javac output is Android-SDK noise that only the SDK build can judge) from lost generics / bridge methods: duplicate `next()` in kotlin.collections, name clashes
  (Guava, kotlin.ranges), `int cannot be dereferenced`, unreported exceptions, `@Override` on stub-less supers.
- Real library classes currently stubbed that must come from real artifacts: Fragment, FragmentActivity,
  Toolbar, RecyclerView, MotionLayout, DrawerLayout, CoordinatorLayout, ComponentActivity, kotlin.* (Intrinsics, Result, Regex…).
- Lossy decompiles: `androidx/media3/container/ObuParser.java` (AV1 header), plus files listed under JADX failure markers
  (SequentialExecutor, AspectRatioFrameLayout, VerticalSeekBar, core/content/res/h.java).
- Resources are apktool-decoded; aapt2 may reject some entries (`values/public.xml`).

## Building from a phone (AIDE cannot build this)
AIDE's aapt rejects the `navigation` and `font` resource dirs and its compiler is too old for this project.
Use GitHub Actions instead: create a repo, upload the *contents* of this folder (so `app/`, `build.gradle`,
`settings.gradle` and `.github/` are at the repo root), open Actions -> "Build XShare" -> Run workflow, then
download the `build-log` artifact and send it back.
