package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class m {
    private static volatile p a;
    private static volatile Handler b;

    public static p a() {
        if (a == null) {
            b();
        }
        return a;
    }

    private static HandlerThread b() {
        if (a == null) {
            synchronized (m.class) {
                try {
                    if (a == null) {
                        p pVar = new p("default_npth_thread");
                        a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a.c();
    }
}
