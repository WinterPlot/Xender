package androidx.work.impl;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkerWrapper b;

    public /* synthetic */ a1(WorkerWrapper workerWrapper, int i) {
        this.a = i;
        this.b = workerWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        WorkerWrapper workerWrapper = this.b;
        switch (i) {
            case 0:
                return WorkerWrapper.runWorker$lambda$1(workerWrapper);
            default:
                return WorkerWrapper.trySetRunning$lambda$14(workerWrapper);
        }
    }
}
