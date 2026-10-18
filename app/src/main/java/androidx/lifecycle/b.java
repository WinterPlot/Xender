package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b<V> {
    private final AtomicReference<V> a;

    public b(V v) {
        this.a = new AtomicReference<>(v);
    }

    public final boolean compareAndSet(V v, V v2) {
        AtomicReference<V> atomicReference = this.a;
        while (!atomicReference.compareAndSet(v, v2)) {
            if (atomicReference.get() != v) {
                return false;
            }
        }
        return true;
    }

    public final V get() {
        return this.a.get();
    }
}
