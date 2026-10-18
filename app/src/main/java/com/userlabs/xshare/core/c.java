package com.userlabs.xshare.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.camera.camera2.pipe.w;
import com.userlabs.xshare.core.utils.i;
import com.userlabs.xshare.core.utils.s;
import com.android.tools.r8.RecordTag;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static Context a;
    private static final Map<String, a> b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a extends RecordTag {
        private final String a;
        private final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public long cacheTimeMills() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Objects.equals(this.a, aVar.a);
        }

        public final int hashCode() {
            long j = this.b;
            return Objects.hashCode(this.a) + (((int) (j ^ (j >>> 32))) * 31);
        }

        public String path() {
            return this.a;
        }

        public final String toString() {
            Object[] objArr = {this.a, Long.valueOf(this.b)};
            String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
            StringBuilder sb = new StringBuilder(a.class.getSimpleName());
            sb.append("[");
            for (int i = 0; i < strArrSplit.length; i++) {
                sb.append(strArrSplit[i]);
                sb.append("=");
                sb.append(objArr[i]);
                if (i != strArrSplit.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    private c() {
    }

    public static boolean canChangeOrientation(Activity activity) {
        return isOverAndroidS() && isLargeScreen(activity);
    }

    public static void clearPrivateDirCache() {
        b.clear();
    }

    private static File getExternalCacheDirFromContext(Context context) {
        File externalCacheDir;
        try {
            externalCacheDir = context.getExternalCacheDir();
        } catch (Throwable unused) {
            externalCacheDir = null;
        }
        if (externalCacheDir != null) {
            return externalCacheDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    private static File getExternalFileDirFromContext(Context context, String str) {
        try {
            for (File file : context.getExternalFilesDirs("")) {
                if (file.getAbsolutePath().startsWith(str)) {
                    return file;
                }
            }
        } catch (Exception unused) {
        }
        return new File(w.p(str, "/Android/data/" + context.getPackageName() + "/files/"));
    }

    private static File getExternalFilesDirFromContext(Context context) {
        File externalFilesDir = null;
        try {
            externalFilesDir = context.getExternalFilesDir(null);
        } catch (Throwable unused) {
        }
        if (externalFilesDir != null) {
            return externalFilesDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/files/"));
    }

    public static Context getInstance() {
        return a;
    }

    private static File getObbDirFromContext(Context context) {
        File obbDir;
        try {
            obbDir = context.getObbDir();
        } catch (Throwable unused) {
            obbDir = null;
        }
        if (obbDir != null) {
            return obbDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/obb/" + context.getPackageName()));
    }

    public static File getXCacheDir() {
        Map<String, a> map = b;
        a aVar = map.get("internal_cache_dir");
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File cacheDir = getInstance().getCacheDir();
        map.put("internal_cache_dir", new a(cacheDir.getAbsolutePath(), System.currentTimeMillis()));
        return cacheDir;
    }

    public static File getXDataDir() {
        Map<String, a> map = b;
        a aVar = map.get("internal_data_dir");
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File dataDir = getInstance().getDataDir();
        map.put("internal_data_dir", new a(dataDir.getAbsolutePath(), System.currentTimeMillis()));
        return dataDir;
    }

    public static File getXExternalCacheDir() {
        Map<String, a> map = b;
        a aVar = map.get("external_cache_dir");
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File externalCacheDirFromContext = getExternalCacheDirFromContext(getInstance());
        map.put("external_cache_dir", new a(externalCacheDirFromContext.getAbsolutePath(), System.currentTimeMillis()));
        return externalCacheDirFromContext;
    }

    public static File getXExternalFilesDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, a> map = b;
        a aVar = map.get("external_specified_files_dir_" + str.hashCode());
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File externalFileDirFromContext = getExternalFileDirFromContext(getInstance(), str);
        map.put("external_specified_files_dir_" + str.hashCode(), new a(externalFileDirFromContext.getAbsolutePath(), System.currentTimeMillis()));
        return externalFileDirFromContext;
    }

    public static File getXFilesDir() {
        Map<String, a> map = b;
        a aVar = map.get("internal_files_dir");
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File filesDir = getInstance().getFilesDir();
        map.put("internal_files_dir", new a(filesDir.getAbsolutePath(), System.currentTimeMillis()));
        return filesDir;
    }

    public static File getXObbDir() {
        Map<String, a> map = b;
        a aVar = map.get("x_obb_dir");
        if (!needGetFromContextAgain(aVar)) {
            return new File(aVar.a);
        }
        File obbDirFromContext = getObbDirFromContext(getInstance());
        map.put("x_obb_dir", new a(obbDirFromContext.getAbsolutePath(), System.currentTimeMillis()));
        return obbDirFromContext;
    }

    public static void initContext(Context context, boolean z) {
        a = context;
        s.initDeviceAspectRatio(context);
        if (z) {
            com.userlabs.xshare.core.preferences.a.initMySharedPreferences(a);
        }
    }

    public static void initContextIfIsNull(Context context) {
        if (a == null) {
            Context contextUpdateToMyLanguage = i.updateToMyLanguage(context);
            a = contextUpdateToMyLanguage;
            com.userlabs.xshare.core.preferences.a.initMySharedPreferences(contextUpdateToMyLanguage);
        }
    }

    public static boolean isAndroidN_MR1() {
        return Build.VERSION.SDK_INT == 25;
    }

    public static boolean isAndroidQAndTargetQ() {
        return isOverAndroidQ();
    }

    public static boolean isAndroidQAndTargetQAndNoStorageLegacy() {
        return false;
    }

    public static boolean isAndroidQPreview() {
        return Build.VERSION.SDK_INT < 29 && "Q".equalsIgnoreCase(Build.VERSION.RELEASE);
    }

    public static boolean isAndroidRAndTargetR() {
        return isOverAndroidR();
    }

    public static boolean isAndroidRAndTargetRAndHasAllFilePermission() {
        return isAndroidRAndTargetR() && Environment.isExternalStorageManager();
    }

    public static boolean isAndroidSAndTargetS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isBelowAndroidQ() {
        return Build.VERSION.SDK_INT < 29 && !"Q".equalsIgnoreCase(Build.VERSION.RELEASE);
    }

    public static boolean isLargeScreen(Context context) {
        try {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        } catch (Exception unused) {
        }
    }

    public static boolean isNotAndroidN() {
        int i = Build.VERSION.SDK_INT;
        return (i == 24 || i == 25) ? false : true;
    }

    public static boolean isOverAndroidBAKLAVA() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean isOverAndroidM() {
        return true;
    }

    public static boolean isOverAndroidN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isOverAndroidO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isOverAndroidP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isOverAndroidQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isOverAndroidR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isOverAndroidS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isOverAndroidT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean isOverAndroidU() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean isOverAndroidV() {
        return Build.VERSION.SDK_INT >= 35;
    }

    private static boolean needGetFromContextAgain(a aVar) {
        return aVar == null || TextUtils.isEmpty(aVar.a) || System.currentTimeMillis() - aVar.b > 300000;
    }

    public static void releasePortraitIfNeeded(Activity activity) {
        if (canChangeOrientation(activity)) {
            activity.setRequestedOrientation(-1);
        }
    }

    public static void safeGrantUriPermission(String str, int i) {
        safeGrantUriPermission(getInstance().getPackageName(), Uri.parse(str), i);
    }

    public static void setLanguage() {
        a = i.updateToMyLanguage(a);
    }

    public static void safeGrantUriPermission(String str, Uri uri, int i) {
        try {
            getInstance().grantUriPermission(str, uri, i);
        } catch (Throwable unused) {
        }
    }

    public static File getXExternalFilesDir() {
        Map<String, a> map = b;
        a aVar = map.get("external_files_dir");
        if (needGetFromContextAgain(aVar)) {
            File externalFilesDirFromContext = getExternalFilesDirFromContext(getInstance());
            map.put("external_files_dir", new a(externalFilesDirFromContext.getAbsolutePath(), System.currentTimeMillis()));
            return externalFilesDirFromContext;
        }
        return new File(aVar.a);
    }
}
