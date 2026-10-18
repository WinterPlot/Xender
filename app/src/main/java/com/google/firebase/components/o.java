package com.google.firebase.components;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class o<T> implements com.google.firebase.inject.b<T> {
    private static final Object c = new Object();
    private volatile Object a;
    private volatile com.google.firebase.inject.b<T> b;

    public o(T t) {
        this.a = c;
        this.a = t;
    }

    @Override // com.google.firebase.inject.b
    public T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public boolean isInitialized() {
        return this.a != c;
    }

    public o(com.google.firebase.inject.b<T> bVar) {
        this.a = c;
        this.b = bVar;
    }
}
