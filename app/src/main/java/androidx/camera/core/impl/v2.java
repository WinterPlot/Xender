package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class v2 {
    private static final v2 b = new v2(new ArrayMap());
    protected final Map<String, Object> a;

    public v2(Map<String, Object> map) {
        this.a = map;
    }

    public static v2 create(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new v2(arrayMap);
    }

    public static v2 emptyBundle() {
        return b;
    }

    public static v2 from(v2 v2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : v2Var.listKeys()) {
            arrayMap.put(str, v2Var.getTag(str));
        }
        return new v2(arrayMap);
    }

    public Object getTag(String str) {
        return this.a.get(str);
    }

    public Set<String> listKeys() {
        return this.a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
