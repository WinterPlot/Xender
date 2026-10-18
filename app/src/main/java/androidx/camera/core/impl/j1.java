package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    private static final Object a = new Object();
    private static final Map<Object, z> b = new HashMap();

    private j1() {
    }

    public static void addConfig(Object obj, z zVar) {
        synchronized (a) {
            b.put(obj, zVar);
        }
    }

    public static void clear() {
        synchronized (a) {
            b.clear();
        }
    }

    public static z getConfigProvider(Object obj) {
        z zVar;
        synchronized (a) {
            zVar = b.get(obj);
        }
        return zVar == null ? z.a : zVar;
    }
}
