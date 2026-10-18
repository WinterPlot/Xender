package com.google.firebase.encoders;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private final String a;
    private final Map<Class<?>, Object> b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final String a;
        private Map<Class<?>, Object> b = null;

        public b(String str) {
            this.a = str;
        }

        public c build() {
            return new c(this.a, this.b == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(this.b)));
        }

        public <T extends Annotation> b withProperty(T t) {
            Map map = this.b;
            if (map == null) {
                map = new HashMap();
                this.b = map;
            }
            map.put(t.annotationType(), t);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static b builder(String str) {
        return new b(str);
    }

    public static c of(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public String getName() {
        return this.a;
    }

    public <T extends Annotation> T getProperty(Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
