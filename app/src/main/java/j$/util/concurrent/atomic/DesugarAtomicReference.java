package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public class DesugarAtomicReference {
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        while (true) {
            V v = atomicReference.get();
            T tApply = unaryOperator.apply(v);
            while (!atomicReference.compareAndSet(v, tApply)) {
                if (atomicReference.get() != v) {
                }
            }
            return v;
        }
    }
}
