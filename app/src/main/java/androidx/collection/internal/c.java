package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c<K, V> {
    private final LinkedHashMap<K, V> a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c<? extends K, V> cVar) {
        this(0, 0.0f, 3, null);
        cVar.getClass();
        for (Map.Entry<? extends K, V> entry : cVar.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final V get(K k) {
        k.getClass();
        return this.a.get(k);
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.a.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        return this.a.put(k, v);
    }

    public final V remove(K k) {
        k.getClass();
        return this.a.remove(k);
    }

    public c(int i, float f) {
        this.a = new LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ c(int i, float f, int i2, r rVar) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    public c() {
        this(0, 0.0f, 3, null);
    }
}
