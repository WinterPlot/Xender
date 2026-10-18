package androidx.tracing;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends a {
    public static final n a = new n();
    private static final AtomicInteger b = new AtomicInteger(0);

    private n() {
    }

    @Override // androidx.tracing.a, java.lang.AutoCloseable
    public void close() {
        b.set(0);
    }

    @Override // androidx.tracing.a
    public void enqueue(y yVar) {
        b.incrementAndGet();
        yVar.recycle();
    }

    public final AtomicInteger getEnqueues$tracing() {
        return b;
    }

    @Override // androidx.tracing.a
    public void flush() {
    }

    @Override // androidx.tracing.a
    public void onDroppedTraceEvent() {
    }
}
