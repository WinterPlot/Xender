package com.userlabs.xshare;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class u {
    private static void checkWebViewLockFileLocked(Context context, String str) {
        File file = new File(com.userlabs.xshare.core.c.getXDataDir().getAbsolutePath() + "/app_webview" + str + "/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (fileLockTryLock != null) {
                    fileLockTryLock.close();
                } else {
                    createNewFileIfDeleted(file, file.delete());
                }
            } catch (Throwable unused) {
                createNewFileIfDeleted(file, file.exists() && file.delete());
            }
        }
    }

    private static void createNewFileIfDeleted(File file, boolean z) {
        if (z) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Throwable unused) {
            }
        }
    }

    public static String getDataSuffix(Context context) {
        String curProcessName = o.getCurProcessName(context);
        if (!TextUtils.isEmpty(curProcessName)) {
            return curProcessName;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        return context.getPackageName() + strValueOf.substring(strValueOf.length() - 5);
    }

    public static void setWebViewDataDirectorySuffix(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String str2 = "";
                if (!TextUtils.equals(context.getPackageName(), str)) {
                    if (TextUtils.isEmpty(str)) {
                        str = context.getPackageName();
                    }
                    WebView.setDataDirectorySuffix(str);
                    str2 = "_" + str;
                }
                checkWebViewLockFileLocked(context, str2);
            } catch (Exception unused) {
            }
        }
    }
}
