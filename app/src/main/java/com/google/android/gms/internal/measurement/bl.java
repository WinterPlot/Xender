package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class bl extends jl {
    private volatile boolean e;

    public bl(String str, String str2, mm mmVar) {
        super("com.google.android.gms.measurement", str2, mmVar);
    }

    @Override // com.google.android.gms.internal.measurement.sk
    public final /* synthetic */ Object zzc(String str) throws IOException {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.sk
    public final /* synthetic */ Object zzd(Object obj) throws IOException {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.jl, com.google.android.gms.internal.measurement.zk
    public final /* synthetic */ Object zze() {
        return Boolean.valueOf(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.jl, com.google.android.gms.internal.measurement.zk
    public final /* synthetic */ void zzh(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }
}
