package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends g {
    private final float a;

    public h(float f) {
        this.a = f - 0.001f;
    }

    @Override // com.google.android.material.shape.g
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.g
    public void getEdgePath(float f, float f2, float f3, r rVar) {
        float fSqrt = (float) ((Math.sqrt(2.0d) * ((double) this.a)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.a, 2.0d) - Math.pow(fSqrt, 2.0d));
        rVar.reset(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.a)) - ((double) this.a)))) + fSqrt2);
        rVar.lineTo(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.a)) - ((double) this.a))));
        rVar.lineTo(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.a)) - ((double) this.a)))) + fSqrt2);
    }
}
