package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    private static final c a = new mw();

    public /* synthetic */ c(byte[] bArr) {
    }

    public static c zzh(bw bwVar, bw bwVar2) {
        int iZza = bwVar2.zza();
        if (iZza == 0) {
            return a;
        }
        byte[] bArr = null;
        return iZza <= 28 ? new qw(bwVar, bwVar2, bArr) : new rw(bwVar, bwVar2, bArr);
    }

    public abstract void zza(iw iwVar, Object obj);

    public abstract int zzb();

    public abstract Set zzc();
}
