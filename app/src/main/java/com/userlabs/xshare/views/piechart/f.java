package com.userlabs.xshare.views.piechart;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends b<d> {
    private float f;

    public f(ArrayList<d> arrayList) {
        super(arrayList);
        this.f = 0.0f;
    }

    public float getSliceSpace() {
        return this.f;
    }

    public void setSliceSpace(float f) {
        if (f > 45.0f) {
            f = 45.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f = f;
    }
}
