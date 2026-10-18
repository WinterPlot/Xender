package com.userlabs.xshare.push;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static Map<String, Map<String, Object>> a;

    public static synchronized void cachePkgInfo(String str, Map<String, Object> map) {
        try {
            Map map2 = a;
            if (map2 == null) {
                map2 = new HashMap();
                a = map2;
            }
            map2.put(str, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized Map<String, Object> getCachedPkgInfo(String str) {
        Map<String, Map<String, Object>> map = a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public static synchronized Map<String, Object> getCachedPkgInfoAndRemove(String str) {
        Map<String, Map<String, Object>> map = a;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }
}
