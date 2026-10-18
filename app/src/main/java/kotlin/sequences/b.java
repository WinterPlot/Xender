package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class b<T, K> extends kotlin.collections.c<T> {
    private final Iterator<T> c;
    private final kotlin.jvm.functions.l<T, K> d;
    private final HashSet<K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Iterator<? extends T> it, kotlin.jvm.functions.l<? super T, ? extends K> lVar) {
        it.getClass();
        lVar.getClass();
        this.c = it;
        this.d = lVar;
        this.e = new HashSet<>();
    }

    @Override // kotlin.collections.c
    public void computeNext() {
        while (this.c.hasNext()) {
            T next = this.c.next();
            if (this.e.add(this.d.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
