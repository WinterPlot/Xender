package com.bumptech.glide.provider;

import com.bumptech.glide.load.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    private final List<a<?>> a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
        private final Class<T> a;
        final h<T> b;

        public a(Class<T> cls, h<T> hVar) {
            this.a = cls;
            this.b = hVar;
        }

        public boolean handles(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(Class<Z> cls, h<Z> hVar) {
        this.a.add(new a<>(cls, hVar));
    }

    public synchronized <Z> h<Z> get(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.handles(cls)) {
                return (h<Z>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(Class<Z> cls, h<Z> hVar) {
        this.a.add(0, new a<>(cls, hVar));
    }
}
