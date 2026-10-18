package com.userlabs.xshare;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class s {
    public static void checkMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        p.a("must run on main thread");
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void safeSleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }
}
