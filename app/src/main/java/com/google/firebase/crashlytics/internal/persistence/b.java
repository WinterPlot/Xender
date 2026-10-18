package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.f;
import com.google.firebase.crashlytics.internal.h;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    final String a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final File g;

    public b(Context context) {
        String str;
        String processName = h.a.getCurrentProcessDetails(context).getProcessName();
        this.a = processName;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (useV3FileSystem()) {
            str = ".crashlytics.v3" + File.separator + sanitizeName(processName);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File filePrepareBaseDir = prepareBaseDir(new File(filesDir, str));
        this.c = filePrepareBaseDir;
        this.d = prepareBaseDir(new File(filePrepareBaseDir, "open-sessions"));
        this.e = prepareBaseDir(new File(filePrepareBaseDir, "reports"));
        this.f = prepareBaseDir(new File(filePrepareBaseDir, "priority-reports"));
        this.g = prepareBaseDir(new File(filePrepareBaseDir, "native-reports"));
    }

    private void cleanupFileSystemDir(String str) {
        File file = new File(this.b, str);
        if (file.exists() && recursiveDelete(file)) {
            f.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void cleanupFileSystemDirs(String str) {
        String[] list;
        if (!this.b.exists() || (list = this.b.list(new com.userlabs.xshare.social.js.a(str, 1))) == null) {
            return;
        }
        for (String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanupFileSystemDirs$0(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File prepareBaseDir(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                f.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                f.getLogger().e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> safeArrayToList(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    public static String sanitizeName(String str) {
        return str.length() > 40 ? CommonUtils.sha1(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean useV3FileSystem() {
        return !this.a.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(".com.google.firebase.crashlytics.files.v1");
            cleanupFileSystemDirs(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.c);
    }

    public boolean deleteSessionFiles(String str) {
        return recursiveDelete(new File(this.d, str));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.d.list());
    }

    public File getCommonFile(String str) {
        return new File(this.c, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.c.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.g, str);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.g.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.f, str);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.f.listFiles());
    }

    public File getReport(String str) {
        return new File(this.e, str);
    }

    public List<File> getReports() {
        return safeArrayToList(this.e.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }
}
