package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ CallbackToFutureAdapter.a c;
    public final /* synthetic */ kotlin.jvm.functions.a d;

    public /* synthetic */ n(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kotlin.jvm.functions.a aVar = this.d;
        CallbackToFutureAdapter.a aVar2 = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, aVar2, aVar);
                break;
            default:
                k0.future$lambda$2$lambda$1(atomicBoolean, aVar2, aVar);
                break;
        }
    }
}
