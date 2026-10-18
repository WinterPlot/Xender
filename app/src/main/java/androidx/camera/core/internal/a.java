package androidx.camera.core.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class a extends g {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(gVar.getZoomRatio()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(gVar.getMaxZoomRatio()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(gVar.getMinZoomRatio()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(gVar.getLinearZoom())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.m2
    public float getLinearZoom() {
        return this.d;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.m2
    public float getMaxZoomRatio() {
        return this.b;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.m2
    public float getMinZoomRatio() {
        return this.c;
    }

    @Override // androidx.camera.core.internal.g, androidx.camera.core.m2
    public float getZoomRatio() {
        return this.a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
