package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class g3 implements o3 {
    private final o3[] a;

    public g3(o3... o3VarArr) {
        this.a = o3VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.o3
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.o3
    public final m3 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            o3 o3Var = this.a[i];
            if (o3Var.zzb(cls)) {
                return o3Var.zzc(cls);
            }
        }
        okhttp3.b0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
