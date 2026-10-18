package androidx.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class v<K, V> {
    private int a;
    private final androidx.collection.internal.c<K, V> b;
    private final androidx.collection.internal.b c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public v(int i) {
        this.a = i;
        if (!(i > 0)) {
            androidx.collection.internal.d.throwIllegalArgumentException("maxSize <= 0");
        }
        this.b = new androidx.collection.internal.c<>(0, 0.75f);
        this.c = new androidx.collection.internal.b();
    }

    private final int safeSizeOf(K k, V v) {
        int iSizeOf = sizeOf(k, v);
        if (!(iSizeOf >= 0)) {
            androidx.collection.internal.d.throwIllegalStateException("Negative size: " + k + '=' + v);
        }
        return iSizeOf;
    }

    public V create(K k) {
        k.getClass();
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
        k.getClass();
        v.getClass();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.c) {
            i = this.g;
        }
        return i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V get(K k) {
        V v;
        k.getClass();
        synchronized (this.c) {
            V v2 = this.b.get(k);
            if (v2 != null) {
                this.h++;
                return v2;
            }
            this.i++;
            V vCreate = create(k);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    this.f++;
                    v = (V) this.b.put(k, vCreate);
                    if (v != null) {
                        this.b.put(k, v);
                    } else {
                        this.d += safeSizeOf(k, vCreate);
                        kotlin.y yVar = kotlin.y.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, k, vCreate, v);
                return v;
            }
            trimToSize(this.a);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.c) {
            i = this.h;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.c) {
            i = this.a;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.c) {
            i = this.i;
        }
        return i;
    }

    public final V put(K k, V v) {
        V vPut;
        k.getClass();
        v.getClass();
        synchronized (this.c) {
            try {
                this.e++;
                this.d += safeSizeOf(k, v);
                vPut = this.b.put(k, v);
                if (vPut != null) {
                    this.d -= safeSizeOf(k, vPut);
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, k, vPut, v);
        }
        trimToSize(this.a);
        return vPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.c) {
            i = this.e;
        }
        return i;
    }

    public final V remove(K k) {
        V vRemove;
        k.getClass();
        synchronized (this.c) {
            try {
                vRemove = this.b.remove(k);
                if (vRemove != null) {
                    this.d -= safeSizeOf(k, vRemove);
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            androidx.collection.internal.d.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.c) {
            this.a = i;
            kotlin.y yVar = kotlin.y.a;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int sizeOf(K k, V v) {
        k.getClass();
        v.getClass();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.c) {
            linkedHashMap = new LinkedHashMap(this.b.getEntries().size());
            Iterator<T> it = this.b.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.h;
                int i2 = this.i + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.isEmpty() && this.d != 0)) {
                        androidx.collection.internal.d.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.d <= i || this.b.isEmpty()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) kotlin.collections.g0.firstOrNull(this.b.getEntries());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.b.remove((K) key);
                    this.d -= safeSizeOf(key, value);
                    this.g++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
