package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class a0 implements j0 {
    private final Executor a;
    private final Object b = new Object();

    @Nullable
    private d c;

    public a0(Executor executor, d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    @Override // com.google.android.gms.tasks.j0
    public final void zza(j jVar) {
        if (jVar.isCanceled()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new z(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.j0
    public final void zzb() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public final /* synthetic */ Object zzc() {
        return this.b;
    }

    public final /* synthetic */ d zzd() {
        return this.c;
    }
}
