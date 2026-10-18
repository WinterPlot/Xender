package androidx.camera.view;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private final int a;
    private final PointF b;

    public b0(int i, PointF pointF) {
        this.a = i;
        this.b = pointF;
    }

    public final int getFocusState() {
        return this.a;
    }

    public final PointF getTapPoint() {
        return this.b;
    }
}
