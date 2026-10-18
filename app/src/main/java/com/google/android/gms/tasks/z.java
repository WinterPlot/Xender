package com.google.android.gms.tasks;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class z implements Runnable {
    final /* synthetic */ a0 a;

    public z(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        this.a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.a;
        synchronized (a0Var.zzc()) {
            try {
                if (a0Var.zzd() != null) {
                    a0Var.zzd().onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
