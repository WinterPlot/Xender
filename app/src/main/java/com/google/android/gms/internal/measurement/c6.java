package com.google.android.gms.internal.measurement;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class c6 implements com.google.common.base.u {
    private static final c6 b = new c6();
    private final com.google.common.base.u a = Suppliers.ofInstance(new e6());

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
    public final d6 get() {
        return (d6) this.a.get();
    }
}
