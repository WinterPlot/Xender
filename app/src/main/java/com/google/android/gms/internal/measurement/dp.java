package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class dp {
    private final Context a;
    private final op b = new op();

    public /* synthetic */ dp(Context context, byte[] bArr) {
        vp.zza(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public final ep zza() {
        return new ep(this, null);
    }

    public final /* synthetic */ Context zzb() {
        return this.a;
    }

    public final /* synthetic */ op zzc() {
        return this.b;
    }
}
