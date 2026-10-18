package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class c3 {
    public static final List zza(Object obj, long j) {
        z2 z2Var = (z2) t4.zzm(obj, j);
        if (z2Var.zza()) {
            return z2Var;
        }
        int size = z2Var.size();
        z2 z2VarZzg = z2Var.zzg(size == 0 ? 10 : size + size);
        t4.zzn(obj, j, z2VarZzg);
        return z2VarZzg;
    }
}
