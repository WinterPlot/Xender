package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a<K, V> implements Iterable<Map.Entry<K, V>> {
    c<K, V> a;
    private c<K, V> b;
    private final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    private int d = 0;

    /* JADX INFO: renamed from: androidx.arch.core.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0031a<K, V> extends e<K, V> {
        public C0031a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.a.e
        public c<K, V> backward(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // androidx.arch.core.internal.a.e
        public c<K, V> forward(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.a.e
        public c<K, V> backward(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // androidx.arch.core.internal.a.e
        public c<K, V> forward(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c<K, V> implements Map.Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        c<K, V> d;

        public c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.a + "=" + this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        private c<K, V> a;
        private boolean b = true;

        public d() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b) {
                return a.this.a != null;
            }
            c<K, V> cVar = this.a;
            return (cVar == null || cVar.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.b) {
                this.b = false;
                c<K, V> cVar = a.this.a;
                this.a = cVar;
                return cVar;
            }
            c<K, V> cVar2 = this.a;
            c<K, V> cVar3 = cVar2 != null ? cVar2.c : null;
            this.a = cVar3;
            return cVar3;
        }

        @Override // androidx.arch.core.internal.a.f
        public void supportRemove(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        c<K, V> a;
        c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        private c<K, V> nextNode() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return forward(cVar);
        }

        public abstract c<K, V> backward(c<K, V> cVar);

        public abstract c<K, V> forward(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = nextNode();
            return cVar;
        }

        @Override // androidx.arch.core.internal.a.f
        public void supportRemove(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar && cVar == this.b) {
                cVar2 = null;
                this.b = null;
                this.a = null;
            }
            if (cVar2 == cVar) {
                this.a = backward(cVar2);
            }
            if (this.b == cVar) {
                this.b = nextNode();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class f<K, V> {
        public abstract void supportRemove(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> eldest() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (size() != aVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = aVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public c<K, V> get(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0031a c0031a = new C0031a(this.a, this.b);
        this.c.put(c0031a, Boolean.FALSE);
        return c0031a;
    }

    public a<K, V>.d iteratorWithAdditions() {
        a<K, V>.d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> newest() {
        return this.b;
    }

    public c<K, V> put(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public V putIfAbsent(K k, V v) {
        c<K, V> cVar = get(k);
        if (cVar != null) {
            return cVar.b;
        }
        put(k, v);
        return null;
    }

    public V remove(K k) {
        c<K, V> cVar = get(k);
        if (cVar == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            Iterator<f<K, V>> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                it.next().supportRemove(cVar);
            }
        }
        c<K, V> cVar2 = cVar.d;
        c<K, V> cVar3 = cVar.c;
        if (cVar2 != null) {
            cVar2.c = cVar3;
        } else {
            this.a = cVar3;
        }
        c<K, V> cVar4 = cVar.c;
        if (cVar4 != null) {
            cVar4.d = cVar2;
        } else {
            this.b = cVar2;
        }
        cVar.c = null;
        cVar.d = null;
        return cVar.b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
