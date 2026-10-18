package com.bumptech.glide.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    private g() {
    }

    public static double getElapsedMillis(long j) {
        return (getLogTime() - j) * a;
    }

    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
