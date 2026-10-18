package androidx.work;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    private final String a;
    private final WorkerParameters b;
    private final Throwable c;

    public h0(String str, WorkerParameters workerParameters, Throwable th) {
        str.getClass();
        workerParameters.getClass();
        th.getClass();
        this.a = str;
        this.b = workerParameters;
        this.c = th;
    }

    public final Throwable getThrowable() {
        return this.c;
    }

    public final String getWorkerClassName() {
        return this.a;
    }

    public final WorkerParameters getWorkerParameters() {
        return this.b;
    }
}
