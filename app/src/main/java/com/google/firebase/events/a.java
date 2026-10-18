package com.google.firebase.events;

import com.google.firebase.components.v;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a<T> {
    private final Class<T> a;
    private final T b;

    public a(Class<T> cls, T t) {
        this.a = (Class) v.checkNotNull(cls);
        this.b = (T) v.checkNotNull(t);
    }

    public T getPayload() {
        return this.b;
    }

    public Class<T> getType() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
