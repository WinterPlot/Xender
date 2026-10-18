package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class q extends t2 {
    private final Size a;
    private final Map<Integer, Size> b;
    private final Size c;
    private final Map<Integer, Size> d;
    private final Size e;
    private final Map<Integer, Size> f;
    private final Map<Integer, Size> g;
    private final Map<Integer, Size> h;
    private final Map<Integer, Size> i;

    public q(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            com.google.gson.internal.a.j("Null analysisSize");
            throw null;
        }
        this.a = size;
        if (map == null) {
            com.google.gson.internal.a.j("Null s720pSizeMap");
            throw null;
        }
        this.b = map;
        if (size2 == null) {
            com.google.gson.internal.a.j("Null previewSize");
            throw null;
        }
        this.c = size2;
        if (map2 == null) {
            com.google.gson.internal.a.j("Null s1440pSizeMap");
            throw null;
        }
        this.d = map2;
        if (size3 == null) {
            com.google.gson.internal.a.j("Null recordSize");
            throw null;
        }
        this.e = size3;
        if (map3 == null) {
            com.google.gson.internal.a.j("Null maximumSizeMap");
            throw null;
        }
        this.f = map3;
        if (map4 == null) {
            com.google.gson.internal.a.j("Null maximum4x3SizeMap");
            throw null;
        }
        this.g = map4;
        if (map5 == null) {
            com.google.gson.internal.a.j("Null maximum16x9SizeMap");
            throw null;
        }
        this.h = map5;
        if (map6 != null) {
            this.i = map6;
        } else {
            com.google.gson.internal.a.j("Null ultraMaximumSizeMap");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            if (this.a.equals(t2Var.getAnalysisSize()) && this.b.equals(t2Var.getS720pSizeMap()) && this.c.equals(t2Var.getPreviewSize()) && this.d.equals(t2Var.getS1440pSizeMap()) && this.e.equals(t2Var.getRecordSize()) && this.f.equals(t2Var.getMaximumSizeMap()) && this.g.equals(t2Var.getMaximum4x3SizeMap()) && this.h.equals(t2Var.getMaximum16x9SizeMap()) && this.i.equals(t2Var.getUltraMaximumSizeMap())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.t2
    public Size getAnalysisSize() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getMaximum16x9SizeMap() {
        return this.h;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getMaximum4x3SizeMap() {
        return this.g;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getMaximumSizeMap() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.t2
    public Size getPreviewSize() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.t2
    public Size getRecordSize() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getS1440pSizeMap() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getS720pSizeMap() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.t2
    public Map<Integer, Size> getUltraMaximumSizeMap() {
        return this.i;
    }

    public int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
