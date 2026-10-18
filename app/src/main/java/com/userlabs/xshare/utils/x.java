package com.userlabs.xshare.utils;

import android.os.Build;
import android.os.Environment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class x {
    public static long a = 0;
    public static boolean b = false;
    public static long c;
    public static long d;
    public static long e;
    public static int f;

    public static String generateCrashlyticsUserId() {
        return "FFFF" + Build.MODEL + Build.VERSION.SDK_INT;
    }

    public static String getDownloadedFileName(String str) {
        return str.substring(0, str.lastIndexOf(".temp"));
    }

    public static boolean isExternalStorageAvailable() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }
}
