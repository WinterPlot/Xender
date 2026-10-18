package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o {
    private static final Set a = new HashSet(Arrays.asList("app_update", "review"));
    private static final Set b = new HashSet(Arrays.asList("native", "unity"));
    private static final Map c = new HashMap();
    private static final s d = new s("PlayCoreVersion");

    public static synchronized Map zza(String str) {
        Map map;
        try {
            map = c;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get("app_update");
    }
}
