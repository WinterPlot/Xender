package androidx.collection;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class e0<K, V> implements Map.Entry<K, V>, kotlin.jvm.internal.markers.g.a {
    private final Object[] a;
    private final Object[] b;
    private final int c;

    public e0(Object[] objArr, Object[] objArr2, int i) {
        objArr.getClass();
        objArr2.getClass();
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
    }

    public final int getIndex() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.a[this.c];
    }

    public final Object[] getKeys() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.b[this.c];
    }

    public final Object[] getValues() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        Object[] objArr = this.b;
        int i = this.c;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
