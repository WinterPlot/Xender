package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class l<T1, T2, V> implements m<V> {
    private final m<T1> a;
    private final m<T2> b;
    private final kotlin.jvm.functions.p<T1, T2, V> c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class a implements Iterator<V>, kotlin.jvm.internal.markers.a {
        private final Iterator<T1> a;
        private final Iterator<T2> b;
        final /* synthetic */ l<T1, T2, V> c;

        public a(l<T1, T2, V> lVar) {
            this.c = lVar;
            this.a = ((l) lVar).a.iterator();
            this.b = ((l) lVar).b.iterator();
        }

        public final Iterator<T1> getIterator1() {
            return this.a;
        }

        public final Iterator<T2> getIterator2() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() && this.b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((l) this.c).c.invoke(this.a.next(), this.b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(m<? extends T1> mVar, m<? extends T2> mVar2, kotlin.jvm.functions.p<? super T1, ? super T2, ? extends V> pVar) {
        mVar.getClass();
        mVar2.getClass();
        pVar.getClass();
        this.a = mVar;
        this.b = mVar2;
        this.c = pVar;
    }

    @Override // kotlin.sequences.m
    public Iterator<V> iterator() {
        return new a(this);
    }
}
