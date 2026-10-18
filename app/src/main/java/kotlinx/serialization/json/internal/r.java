package kotlinx.serialization.json.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class r {
    private final Map<kotlinx.serialization.descriptors.f, Map<a<Object>, Object>> a = q.createMapForCache(16);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
    }

    public final <T> T get(kotlinx.serialization.descriptors.f fVar, a<T> aVar) {
        fVar.getClass();
        aVar.getClass();
        Map<a<Object>, Object> map = this.a.get(fVar);
        T t = map != null ? (T) map.get(aVar) : null;
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T getOrPut(kotlinx.serialization.descriptors.f fVar, a<T> aVar, kotlin.jvm.functions.a<? extends T> aVar2) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        T t = (T) get(fVar, aVar);
        if (t != null) {
            return t;
        }
        T tInvoke = aVar2.invoke();
        set(fVar, aVar, tInvoke);
        return tInvoke;
    }

    public final <T> void set(kotlinx.serialization.descriptors.f fVar, a<T> aVar, T t) {
        fVar.getClass();
        aVar.getClass();
        t.getClass();
        Map<kotlinx.serialization.descriptors.f, Map<a<Object>, Object>> map = this.a;
        Map<a<Object>, Object> mapCreateMapForCache = map.get(fVar);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = q.createMapForCache(2);
            map.put(fVar, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(aVar, t);
    }
}
