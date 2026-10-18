package androidx.tracing;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class w<T> {
    private final int a;
    private final boolean b;
    private final kotlin.jvm.functions.l<w<T>, T> c;
    private AtomicLong d;
    private final kotlin.collections.k<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public w(int i, boolean z, kotlin.jvm.functions.l<? super w<T>, ? extends T> lVar) {
        this.a = i;
        this.b = z;
        this.c = lVar;
        if (z) {
            this.d = new AtomicLong(0L);
        }
        this.e = new kotlin.collections.k<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.e.addLast(this.c.invoke(this));
        }
    }

    public final long count$tracing() {
        AtomicLong atomicLong = this.d;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public final T obtain$tracing() {
        AtomicLong atomicLong;
        T tRemoveFirstOrNull = this.e.removeFirstOrNull();
        if (tRemoveFirstOrNull == null) {
            tRemoveFirstOrNull = this.c.invoke(this);
        }
        if (this.b && tRemoveFirstOrNull != null && (atomicLong = this.d) != null) {
            atomicLong.incrementAndGet();
        }
        return tRemoveFirstOrNull;
    }

    public final void release$tracing(T t) {
        AtomicLong atomicLong;
        if (this.b && (atomicLong = this.d) != null) {
            long j = atomicLong.get();
            atomicLong.compareAndSet(j, j - 1);
        }
        if (this.e.size() < this.a) {
            this.e.addFirst(t);
        }
    }
}
