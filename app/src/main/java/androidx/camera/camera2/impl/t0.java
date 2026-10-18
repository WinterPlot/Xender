package androidx.camera.camera2.impl;

import androidx.camera.core.impl.v2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static final Map<String, Object> toMap(v2 v2Var) {
        v2Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setListKeys = v2Var.listKeys();
        setListKeys.getClass();
        for (String str : setListKeys) {
            Object tag = v2Var.getTag(str);
            tag.getClass();
            linkedHashMap.put(str, tag);
        }
        return linkedHashMap;
    }
}
