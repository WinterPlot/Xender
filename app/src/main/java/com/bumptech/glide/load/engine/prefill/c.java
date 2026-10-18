package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c {
    private final Map<d, Integer> a;
    private final List<d> b;
    private int c;
    private int d;

    public c(Map<d, Integer> map) {
        this.a = map;
        this.b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.c = num.intValue() + this.c;
        }
    }

    public int getSize() {
        return this.c;
    }

    public boolean isEmpty() {
        return this.c == 0;
    }

    public d remove() {
        d dVar = this.b.get(this.d);
        Integer num = this.a.get(dVar);
        int iIntValue = num.intValue();
        Map<d, Integer> map = this.a;
        if (iIntValue == 1) {
            map.remove(dVar);
            this.b.remove(this.d);
        } else {
            map.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.c--;
        this.d = this.b.isEmpty() ? 0 : (this.d + 1) % this.b.size();
        return dVar;
    }
}
