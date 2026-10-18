package kotlinx.serialization.descriptors;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements Iterator<f>, kotlin.jvm.internal.markers.a {
        private int a;
        final /* synthetic */ f b;

        public a(f fVar) {
            this.b = fVar;
            this.a = fVar.getElementsCount();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0;
        }

        @Override // java.util.Iterator
        public f next() {
            f fVar = this.b;
            int elementsCount = fVar.getElementsCount();
            int i = this.a;
            this.a = i - 1;
            return fVar.getElementDescriptor(elementsCount - i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements Iterator<String>, kotlin.jvm.internal.markers.a {
        private int a;
        final /* synthetic */ f b;

        public b(f fVar) {
            this.b = fVar;
            this.a = fVar.getElementsCount();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0;
        }

        @Override // java.util.Iterator
        public String next() {
            f fVar = this.b;
            int elementsCount = fVar.getElementsCount();
            int i = this.a;
            this.a = i - 1;
            return fVar.getElementName(elementsCount - i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c implements Iterable<f>, kotlin.jvm.internal.markers.a {
        final /* synthetic */ f a;

        public c(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d implements Iterable<String>, kotlin.jvm.internal.markers.a {
        final /* synthetic */ f a;

        public d(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.a);
        }
    }

    public static final Iterable<f> getElementDescriptors(f fVar) {
        fVar.getClass();
        return new c(fVar);
    }

    public static final Iterable<String> getElementNames(f fVar) {
        fVar.getClass();
        return new d(fVar);
    }
}
