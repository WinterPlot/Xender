package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends g {
    private final g a;
    private final float b;

    public l(g gVar, float f) {
        this.a = gVar;
        this.b = f;
    }

    @Override // com.google.android.material.shape.g
    public boolean forceIntersection() {
        return this.a.forceIntersection();
    }

    @Override // com.google.android.material.shape.g
    public void getEdgePath(float f, float f2, float f3, r rVar) {
        this.a.getEdgePath(f, f2 - this.b, f3, rVar);
    }
}
