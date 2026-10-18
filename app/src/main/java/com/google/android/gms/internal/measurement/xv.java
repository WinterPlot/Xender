package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class xv {
    public static /* synthetic */ boolean zza(int i, av avVar, StringBuilder sb) {
        if (i - 1 != 0 || avVar == av.a) {
            return false;
        }
        sb.append(avVar.zza());
        sb.append('.');
        sb.append(avVar.zzb());
        sb.append(':');
        sb.append(avVar.zzc());
        return true;
    }
}
