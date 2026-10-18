package com.google.android.gms.internal.measurement;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class y6 implements com.google.common.base.u {
    private static final y6 b = new y6();
    private final com.google.common.base.u a = Suppliers.ofInstance(new a7());

    @SideEffectFree
    public static boolean zza() {
        return b.get().zza();
    }

    @Override // com.google.common.base.u
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final z6 get() {
        return (z6) this.a.get();
    }
}
