package androidx.camera.core.internal;

import androidx.camera.core.m2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements m2 {
    public static m2 create(m2 m2Var) {
        return new a(m2Var.getZoomRatio(), m2Var.getMaxZoomRatio(), m2Var.getMinZoomRatio(), m2Var.getLinearZoom());
    }

    @Override // androidx.camera.core.m2
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.m2
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.m2
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.m2
    public abstract float getZoomRatio();

    public static m2 create(float f, float f2, float f3, float f4) {
        return new a(f, f2, f3, f4);
    }
}
