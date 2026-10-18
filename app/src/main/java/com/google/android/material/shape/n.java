package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class n extends e {
    float a;

    public n() {
        this.a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void getCornerPath(r rVar, float f, float f2, float f3) {
        float f4 = f3 * f2;
        rVar.reset(0.0f, f4, 180.0f, 180.0f - f);
        float f5 = f4 * 2.0f;
        rVar.addArc(0.0f, 0.0f, f5, f5, 180.0f, f);
    }

    @Deprecated
    public n(float f) {
        this.a = f;
    }
}
