package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {
    private Rational a;

    public r1(Rational rational) {
        this.a = rational;
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    public abstract PointF convertPoint(float f, float f2);

    public final q1 createPoint(float f, float f2, float f3) {
        PointF pointFConvertPoint = convertPoint(f, f2);
        return new q1(pointFConvertPoint.x, pointFConvertPoint.y, f3, this.a);
    }

    public void setSurfaceAspectRatio(Rational rational) {
        this.a = rational;
    }

    public r1() {
        this(null);
    }

    public final q1 createPoint(float f, float f2) {
        return createPoint(f, f2, getDefaultPointSize());
    }
}
