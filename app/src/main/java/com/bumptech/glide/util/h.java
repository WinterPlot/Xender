package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class h<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<Y> {
        final Y a;
        final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public h(long j) {
        this.b = j;
        this.c = j;
    }

    private void evict() {
        trimToSize(this.c);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(T t) {
        return this.a.containsKey(t);
    }

    public synchronized Y get(T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public synchronized int getCount() {
        return this.a.size();
    }

    public synchronized long getCurrentSize() {
        return this.d;
    }

    public synchronized long getMaxSize() {
        return this.c;
    }

    public int getSize(Y y) {
        return 1;
    }

    public synchronized Y put(T t, Y y) {
        int size = getSize(y);
        long j = size;
        if (j >= this.c) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        a<Y> aVarPut = this.a.put(t, y == null ? null : new a<>(y, size));
        if (aVarPut != null) {
            this.d -= (long) aVarPut.b;
            if (!aVarPut.a.equals(y)) {
                onItemEvicted(t, aVarPut.a);
            }
        }
        evict();
        return aVarPut != null ? aVarPut.a : null;
    }

    public synchronized Y remove(T t) {
        a<Y> aVarRemove = this.a.remove(t);
        if (aVarRemove == null) {
            return null;
        }
        this.d -= (long) aVarRemove.b;
        return aVarRemove.a;
    }

    public synchronized void setSizeMultiplier(float f) {
        try {
            if (f < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.c = Math.round(this.b * f);
            evict();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void trimToSize(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= (long) value.b;
            T key = next.getKey();
            it.remove();
            onItemEvicted(key, value.a);
        }
    }

    public void onItemEvicted(T t, Y y) {
    }
}
