package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class y2 {
    private final zzji a;

    public y2(zzji zzjiVar) {
        this.a = zzjiVar;
    }

    public static y2 zzc(String str) {
        return new y2((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : m8.zzj(str.charAt(0)));
    }

    public final zzji zza() {
        return this.a;
    }

    public final String zzb() {
        return String.valueOf(m8.zzm(this.a));
    }
}
