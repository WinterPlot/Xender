package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class tb extends ca {
    private final com.google.android.gms.measurement.internal.q8 a;

    public tb(com.google.android.gms.measurement.internal.q8 q8Var) {
        this.a = q8Var;
    }

    @Override // com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.da
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.a.interceptEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.da
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
