package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    private static final e.a<?> b = new a();
    private final Map<Class<?>, e.a<?>> a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> build(Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public synchronized <T> e<T> build(T t) {
        e.a<?> aVar;
        try {
            com.bumptech.glide.util.k.checkNotNull(t);
            aVar = this.a.get(t.getClass());
            if (aVar == null) {
                for (e.a<?> aVar2 : this.a.values()) {
                    if (aVar2.getDataClass().isAssignableFrom(t.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e<T>) aVar.build(t);
    }

    public synchronized void register(e.a<?> aVar) {
        this.a.put(aVar.getDataClass(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements e<Object> {
        private final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object rewindAndGet() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void cleanup() {
        }
    }
}
