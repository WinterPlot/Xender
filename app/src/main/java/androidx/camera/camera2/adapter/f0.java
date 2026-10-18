package androidx.camera.camera2.adapter;

import androidx.camera.core.m2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements m2 {
    private final float a;
    private final float b;
    private final float c;
    private Float d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final float a;

        public a(float f) {
            this.a = f;
        }

        public static /* synthetic */ a copy$default(a aVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.a;
            }
            return aVar.copy(f);
        }

        public final float component1() {
            return this.a;
        }

        public final a copy(float f) {
            return new a(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final float getValue() {
            return this.a;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            return "LinearZoom(value=" + this.a + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(a aVar, float f, float f2) {
        this(androidx.camera.camera2.internal.j.a.getZoomRatioFromLinearZoom(aVar.getValue(), f, f2), f, f2);
        aVar.getClass();
        this.d = Float.valueOf(aVar.getValue());
    }

    private final float component1() {
        return this.a;
    }

    private final float component2() {
        return this.b;
    }

    private final float component3() {
        return this.c;
    }

    public static /* synthetic */ f0 copy$default(f0 f0Var, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = f0Var.a;
        }
        if ((i & 2) != 0) {
            f2 = f0Var.b;
        }
        if ((i & 4) != 0) {
            f3 = f0Var.c;
        }
        return f0Var.copy(f, f2, f3);
    }

    public final f0 copy(float f, float f2, float f3) {
        return new f0(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.a, f0Var.a) == 0 && Float.compare(this.b, f0Var.b) == 0 && Float.compare(this.c, f0Var.c) == 0;
    }

    @Override // androidx.camera.core.m2
    public float getLinearZoom() {
        Float f = this.d;
        return f != null ? f.floatValue() : androidx.camera.camera2.internal.j.a.getLinearZoomFromZoomRatio(this.a, this.b, this.c);
    }

    @Override // androidx.camera.core.m2
    public float getMaxZoomRatio() {
        return this.c;
    }

    @Override // androidx.camera.core.m2
    public float getMinZoomRatio() {
        return this.b;
    }

    @Override // androidx.camera.core.m2
    public float getZoomRatio() {
        return this.a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31);
    }

    public String toString() {
        return "ZoomValue(zoomRatio=" + this.a + ", minZoomRatio=" + this.b + ", maxZoomRatio=" + this.c + ')';
    }

    public f0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }
}
