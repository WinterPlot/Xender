package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class iv extends lv {
    final /* synthetic */ lv c;
    final /* synthetic */ lv d;

    public iv(lv lvVar, lv lvVar2) {
        this.c = lvVar;
        this.d = lvVar2;
    }

    @Override // com.google.android.gms.internal.measurement.lv
    public final void zzb() {
        try {
            this.c.zzb();
        } finally {
            this.d.zzb();
        }
    }
}
