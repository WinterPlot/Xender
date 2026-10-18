package com.google.firebase.components;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class w<T> {
    private final Class<? extends Annotation> a;
    private final Class<T> b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public @interface a {
    }

    public w(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> w<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new w<>(cls, cls2);
    }

    public static <T> w<T> unqualified(Class<T> cls) {
        return new w<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.b.equals(wVar.b)) {
            return this.a.equals(wVar.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
