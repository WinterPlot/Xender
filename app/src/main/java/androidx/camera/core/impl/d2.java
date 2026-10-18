package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class d2 extends v2 {
    private d2(Map<String, Object> map) {
        super(map);
    }

    public static d2 create() {
        return new d2(new ArrayMap());
    }

    public static d2 from(v2 v2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : v2Var.listKeys()) {
            arrayMap.put(str, v2Var.getTag(str));
        }
        return new d2(arrayMap);
    }

    public void addTagBundle(v2 v2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.a;
        if (map2 == null || (map = v2Var.a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void putTag(String str, Object obj) {
        this.a.put(str, obj);
    }
}
