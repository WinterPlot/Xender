package com.userlabs.xshare.precondition.data;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private final boolean a;
    private final boolean b;

    public b(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static b create(List<c> list) {
        boolean z = true;
        boolean z2 = true;
        for (c cVar : list) {
            if (cVar.getItem_type() == 0 && cVar.getGet_condition_state() != 2) {
                if (cVar.mustReadyCondition() && z) {
                    z = false;
                }
                if (!cVar.mustReadyCondition() && z2) {
                    z2 = false;
                }
            }
        }
        return new b(z, z2);
    }

    public boolean allPassed() {
        return this.a && this.b;
    }

    public boolean allRequestPassed() {
        return this.a;
    }
}
