package com.google.android.gms.tasks;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class k<TResult> {
    private final p0 a = new p0();

    public k(a aVar) {
        aVar.onCanceledRequested(new l0(this));
    }

    public j<TResult> getTask() {
        return this.a;
    }

    public void setException(Exception exc) {
        this.a.zzc(exc);
    }

    public void setResult(TResult tresult) {
        this.a.zza(tresult);
    }

    public boolean trySetException(Exception exc) {
        return this.a.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.a.zzb(tresult);
    }

    public final /* synthetic */ p0 zza() {
        return this.a;
    }

    public k() {
    }
}
