package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class f<T> implements m<T> {
    private final m<T> a;
    private final kotlin.jvm.functions.l<T, Boolean> b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class a implements Iterator<T>, kotlin.jvm.internal.markers.a {
        private final Iterator<T> a;
        private int b = -1;
        private T c;
        final /* synthetic */ f<T> d;

        public a(f<T> fVar) {
            this.d = fVar;
            this.a = ((f) fVar).a.iterator();
        }

        private final void drop() {
            while (this.a.hasNext()) {
                T next = this.a.next();
                if (!((Boolean) ((f) this.d).b.invoke(next)).booleanValue()) {
                    this.c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        public final int getDropState() {
            return this.b;
        }

        public final Iterator<T> getIterator() {
            return this.a;
        }

        public final T getNextItem() {
            return this.c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                drop();
            }
            return this.b == 1 || this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                drop();
            }
            if (this.b != 1) {
                return this.a.next();
            }
            T t = this.c;
            this.c = null;
            this.b = 0;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i) {
            this.b = i;
        }

        public final void setNextItem(T t) {
            this.c = t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(m<? extends T> mVar, kotlin.jvm.functions.l<? super T, Boolean> lVar) {
        mVar.getClass();
        lVar.getClass();
        this.a = mVar;
        this.b = lVar;
    }

    @Override // kotlin.sequences.m
    public Iterator<T> iterator() {
        return new a(this);
    }
}
