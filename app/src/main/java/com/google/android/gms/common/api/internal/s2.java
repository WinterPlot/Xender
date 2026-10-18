package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    final Set a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final r2 b = new r2(this);

    public final void zaa(BasePendingResult basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.zan(this.b);
    }

    public final void zab() {
        Set set = this.a;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zaj()) {
                set.remove(basePendingResult);
            }
        }
    }
}
