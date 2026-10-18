package androidx.camera.core;

import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class q1 {
    private float a;
    private float b;
    private float c;
    private Rational d;

    public q1(float f, float f2, float f3, Rational rational) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = rational;
    }

    public float getSize() {
        return this.c;
    }

    public Rational getSurfaceAspectRatio() {
        return this.d;
    }

    public float getX() {
        return this.a;
    }

    public float getY() {
        return this.b;
    }
}
