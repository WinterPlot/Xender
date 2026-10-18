package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public static final j0 d = new b().setAlpha(1.0f).setOffset(0.0f, 0.0f).setScale(1.0f, 1.0f).build();
    private final float a;
    private final androidx.core.util.e<Float, Float> b;
    private final androidx.core.util.e<Float, Float> c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private float a;
        private androidx.core.util.e<Float, Float> b;
        private androidx.core.util.e<Float, Float> c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.b = androidx.core.util.e.create(fValueOf2, fValueOf2);
            this.c = androidx.core.util.e.create(fValueOf, fValueOf);
        }

        public j0 build() {
            return new j0(this.a, this.b, this.c);
        }

        public b setAlpha(float f) {
            this.a = f;
            return this;
        }

        public b setOffset(float f, float f2) {
            this.b = androidx.core.util.e.create(Float.valueOf(f), Float.valueOf(f2));
            return this;
        }

        public b setScale(float f, float f2) {
            this.c = androidx.core.util.e.create(Float.valueOf(f), Float.valueOf(f2));
            return this;
        }
    }

    private j0(float f, androidx.core.util.e<Float, Float> eVar, androidx.core.util.e<Float, Float> eVar2) {
        this.a = f;
        this.b = eVar;
        this.c = eVar2;
    }

    public float getAlpha() {
        return this.a;
    }

    public androidx.core.util.e<Float, Float> getOffset() {
        return this.b;
    }

    public androidx.core.util.e<Float, Float> getScale() {
        return this.c;
    }
}
