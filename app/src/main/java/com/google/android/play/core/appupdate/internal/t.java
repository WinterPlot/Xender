package com.google.android.play.core.appupdate.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t implements Runnable {
    private final com.google.android.gms.tasks.k a;

    public t() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public abstract void zza();

    public final com.google.android.gms.tasks.k zzb() {
        return this.a;
    }

    public final void zzc(Exception exc) {
        com.google.android.gms.tasks.k kVar = this.a;
        if (kVar != null) {
            kVar.trySetException(exc);
        }
    }

    public t(com.google.android.gms.tasks.k kVar) {
        this.a = kVar;
    }
}
