package androidx.camera.camera2.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    private j() {
    }

    private final boolean areFloatsEqual(float f, float f2) {
        return nearZero$camera_camera2(f - f2);
    }

    public final float getLinearZoomFromZoomRatio(float f, float f2, float f3) {
        if (areFloatsEqual(f2, f3) || nearZero$camera_camera2(f)) {
            return 0.0f;
        }
        if (areFloatsEqual(f, f3)) {
            return 1.0f;
        }
        if (areFloatsEqual(f, f2)) {
            return 0.0f;
        }
        float f4 = 1.0f / f2;
        return androidx.core.math.a.clamp((f4 - (1.0f / f)) / (f4 - (1.0f / f3)), 0.0f, 1.0f);
    }

    public final float getZoomRatioFromLinearZoom(float f, float f2, float f3) {
        if (areFloatsEqual(f, 1.0f)) {
            return f3;
        }
        if (areFloatsEqual(f, 0.0f)) {
            return f2;
        }
        float f4 = 1.0f / f2;
        return androidx.core.math.a.clamp(1.0f / (f4 - ((f4 - (1.0f / f3)) * f)), f2, f3);
    }

    public final boolean nearZero$camera_camera2(float f) {
        return ((double) Math.abs(f)) < ((double) Math.ulp(Math.abs(f))) * 2.0d;
    }
}
