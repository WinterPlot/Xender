package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class g<K extends l, V> {
    private final a<K, V> a = new a<>();
    private final Map<K, a<K, V>> b = new HashMap();

    private void makeHead(a<K, V> aVar) {
        removeEntry(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        updateEntry(aVar);
    }

    private void makeTail(a<K, V> aVar) {
        removeEntry(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        updateEntry(aVar);
    }

    private static <K, V> void removeEntry(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    private static <K, V> void updateEntry(a<K, V> aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public V get(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.offer();
        }
        makeHead(aVar);
        return aVar.removeLast();
    }

    public void put(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            makeTail(aVar);
            this.b.put(k, aVar);
        } else {
            k.offer();
        }
        aVar.add(v);
    }

    public V removeLast() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V v = (V) aVar.removeLast();
            if (v != null) {
                return v;
            }
            removeEntry(aVar);
            this.b.remove(aVar.a);
            ((l) aVar.a).offer();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.size());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a<K, V> {
        final K a;
        private List<V> b;
        a<K, V> c;
        a<K, V> d;

        public a(K k) {
            this.d = this;
            this.c = this;
            this.a = k;
        }

        public void add(V v) {
            List arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b = arrayList;
            }
            arrayList.add(v);
        }

        public V removeLast() {
            int size = size();
            if (size > 0) {
                return this.b.remove(size - 1);
            }
            return null;
        }

        public int size() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a() {
            this(null);
        }
    }
}
