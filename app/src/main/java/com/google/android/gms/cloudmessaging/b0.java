package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class b0 extends c0 {
    public b0(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.c0
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.cloudmessaging.c0
    public final void zzb(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzc(null);
        } else {
            zzd(new zzt(4, "Invalid response to one way request", null));
        }
    }
}
