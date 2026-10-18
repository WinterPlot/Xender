package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class j implements Runnable {
    final /* synthetic */ k a;

    public /* synthetic */ j(k kVar, i iVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZza = this.a.zza();
        if (jZza == -1 || com.google.android.gms.common.util.i.getInstance().currentTimeMillis() <= jZza) {
            return;
        }
        k.zze(this.a.a);
    }
}
