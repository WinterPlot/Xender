package com.google.android.datatransport.runtime.dagger.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c<T> implements b<T>, com.google.android.datatransport.runtime.dagger.a<T> {
    private static final c<Object> b = new c<>(null);
    private final T a;

    private c(T t) {
        this.a = t;
    }

    public static <T> b<T> create(T t) {
        return new c(d.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> b<T> createNullable(T t) {
        return t == null ? nullInstanceFactory() : new c(t);
    }

    private static <T> c<T> nullInstanceFactory() {
        return (c<T>) b;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.b, javax.inject.a, jakarta.inject.a
    public T get() {
        return this.a;
    }
}
