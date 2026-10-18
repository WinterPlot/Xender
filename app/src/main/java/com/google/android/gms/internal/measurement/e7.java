package com.google.android.gms.internal.measurement;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class e7 implements com.google.common.base.u {
    private static final e7 b = new e7();
    private final com.google.common.base.u a = Suppliers.ofInstance(new g7());

    @SideEffectFree
    public static boolean zza() {
        return b.get().zza();
    }

    @Override // com.google.common.base.u
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final f7 get() {
        return (f7) this.a.get();
    }
}
