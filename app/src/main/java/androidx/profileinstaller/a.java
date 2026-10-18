package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0250a {
        private C0250a() {
        }

        public static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private b() {
        }

        public static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    private a() {
    }

    public static boolean deleteFilesRecursively(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = deleteFilesRecursively(file2) && z;
        }
        return z;
    }

    public static void dropShaderCache(Context context, ProfileInstallReceiver.a aVar) {
        File codeCacheDir;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            codeCacheDir = b.createDeviceProtectedStorageContext(context).getCacheDir();
        } else if (i >= 24) {
            codeCacheDir = C0250a.getCodeCacheDir(b.createDeviceProtectedStorageContext(context));
        } else {
            codeCacheDir = i == 23 ? C0250a.getCodeCacheDir(context) : context.getCacheDir();
        }
        if (deleteFilesRecursively(codeCacheDir)) {
            aVar.onResultReceived(14, null);
        } else {
            aVar.onResultReceived(15, null);
        }
    }
}
