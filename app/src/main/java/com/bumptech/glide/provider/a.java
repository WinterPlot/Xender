package com.bumptech.glide.provider;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    private final List<C0413a<?>> a = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0413a<T> {
        private final Class<T> a;
        final com.bumptech.glide.load.a<T> b;

        public C0413a(Class<T> cls, com.bumptech.glide.load.a<T> aVar) {
            this.a = cls;
            this.b = aVar;
        }

        public boolean handles(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(Class<T> cls, com.bumptech.glide.load.a<T> aVar) {
        this.a.add(new C0413a<>(cls, aVar));
    }

    public synchronized <T> com.bumptech.glide.load.a<T> getEncoder(Class<T> cls) {
        for (C0413a<?> c0413a : this.a) {
            if (c0413a.handles(cls)) {
                return (com.bumptech.glide.load.a<T>) c0413a.b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(Class<T> cls, com.bumptech.glide.load.a<T> aVar) {
        this.a.add(0, new C0413a<>(cls, aVar));
    }
}
