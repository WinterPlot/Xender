package com.google.android.gms.common.util;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    public static boolean zza() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
