package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class fu {
    private static final com.google.common.base.w a;

    static {
        com.google.common.base.w euVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            euVar = new du();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            euVar = new eu();
        }
        a = euVar;
    }

    public static com.google.common.base.w zza() {
        return a;
    }
}
