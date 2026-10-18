package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class ub extends ca {
    private final com.google.android.gms.measurement.internal.r8 a;

    public ub(com.google.android.gms.measurement.internal.r8 r8Var) {
        this.a = r8Var;
    }

    @Override // com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.da
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.a.onEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.da
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
