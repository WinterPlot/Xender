package com.userlabs.xshare.core.log;

import android.util.Log;
import com.userlabs.xshare.utils.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;

    public static void c(String str, String str2) {
        Log.d(str, str2);
    }

    public static void ce(String str, String str2) {
        Log.e(str, str2);
    }

    public static void d(String str, String str2, Object obj) {
        if (!a || obj == null) {
            return;
        }
        StringBuilder sbW = defpackage.a.w(str2, " : ");
        sbW.append(l.getGsonHasTypeAdapter().toJson(obj));
        myLongLog(str, sbW.toString());
    }

    public static void e(String str, String str2) {
        if (a) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (a) {
            Log.i(str, str2);
        }
    }

    public static void myLongLog(String str, String str2) {
        if (str2 == null) {
            d(str, "null");
            return;
        }
        int length = str2.length();
        if (length <= 2048) {
            d(str, str2);
            return;
        }
        int i = 0;
        while (i < length) {
            int i2 = i + 2048;
            if (i2 < length) {
                d(str, str2.substring(i, i2));
            } else {
                d(str, str2.substring(i));
            }
            i = i2;
        }
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void ce(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void w(String str, String str2) {
        Log.w(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        if (a) {
            Log.e(str, str2, th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (a) {
            Log.d(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
    }
}
