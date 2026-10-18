package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    static final f c = new f("FirebaseCrashlytics");
    private final String a;
    private int b = 4;

    public f(String str) {
        this.a = str;
    }

    private boolean canLog(int i) {
        return this.b <= i || Log.isLoggable(this.a, i);
    }

    public static f getLogger() {
        return c;
    }

    public void d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.a, str);
        }
    }

    public void v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.a, str, th);
        }
    }

    public void w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.a, str, th);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }
}
