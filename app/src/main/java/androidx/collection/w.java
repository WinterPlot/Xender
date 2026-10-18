package androidx.collection;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class w<K, V> implements Map.Entry<K, V>, kotlin.jvm.internal.markers.a {
    private final K a;
    private final V b;

    public w(K k, V v) {
        this.a = k;
        this.b = v;
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
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
