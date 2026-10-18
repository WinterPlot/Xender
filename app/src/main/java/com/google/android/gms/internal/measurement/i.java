package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends yv {
    private final String a;

    public i(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.yv
    public String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.yv
    public void zzd(RuntimeException runtimeException, wv wvVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
