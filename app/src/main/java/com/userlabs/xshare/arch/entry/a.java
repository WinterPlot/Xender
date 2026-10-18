package com.userlabs.xshare.arch.entry;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a<K, V> {
    private final K a;
    private V b;

    public a(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public K getKey() {
        return this.a;
    }

    public V getValue() {
        return this.b;
    }

    public V setValue(V v) {
        V v2 = this.b;
        this.b = v;
        return v2;
    }

    public String toString() {
        return this.a + "=" + this.b;
    }
}
