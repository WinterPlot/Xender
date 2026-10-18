package kotlinx.coroutines;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class k implements l {
    private final Future<?> a;

    public k(Future<?> future) {
        this.a = future;
    }

    @Override // kotlinx.coroutines.l
    public void invoke(Throwable th) {
        this.a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
