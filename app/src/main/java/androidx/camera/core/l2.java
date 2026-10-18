package androidx.camera.core;

import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {
    private int a;
    private Rational b;
    private int c;
    private int d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final Rational b;
        private final int c;
        private int a = 1;
        private int d = 0;

        public a(Rational rational, int i) {
            this.b = rational;
            this.c = i;
        }

        public l2 build() {
            androidx.core.util.i.checkNotNull(this.b, "The crop aspect ratio must be set.");
            return new l2(this.a, this.b, this.c, this.d);
        }

        public a setLayoutDirection(int i) {
            this.d = i;
            return this;
        }

        public a setScaleType(int i) {
            this.a = i;
            return this;
        }
    }

    public l2(int i, Rational rational, int i2, int i3) {
        this.a = i;
        this.b = rational;
        this.c = i2;
        this.d = i3;
    }

    public Rational getAspectRatio() {
        return this.b;
    }

    public int getLayoutDirection() {
        return this.d;
    }

    public int getRotation() {
        return this.c;
    }

    public int getScaleType() {
        return this.a;
    }
}
