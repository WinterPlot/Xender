package com.google.android.gms.internal.measurement;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class g5 implements com.google.common.base.u {
    private static final g5 b = new g5();
    private final com.google.common.base.u a = Suppliers.ofInstance(new j5());

    @SideEffectFree
    public static boolean zza() {
        return b.get().zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return b.get().zzb();
    }

    @Override // com.google.common.base.u
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final h5 get() {
        return (h5) this.a.get();
    }
}
