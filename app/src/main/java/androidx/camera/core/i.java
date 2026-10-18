package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class i extends u1.a {
    private final Size a;
    private final Rect b;
    private final int c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends u1.a.AbstractC0090a {
        private Size a;
        private Rect b;
        private Integer c;

        @Override // androidx.camera.core.u1.a.AbstractC0090a
        public u1.a build() {
            String strConcat = this.a == null ? " resolution" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" cropRect");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" rotationDegrees");
            }
            if (strConcat.isEmpty()) {
                return new i(this.a, this.b, this.c.intValue());
            }
            okio.j0.g("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // androidx.camera.core.u1.a.AbstractC0090a
        public u1.a.AbstractC0090a setCropRect(Rect rect) {
            if (rect != null) {
                this.b = rect;
                return this;
            }
            com.google.gson.internal.a.j("Null cropRect");
            return null;
        }

        @Override // androidx.camera.core.u1.a.AbstractC0090a
        public u1.a.AbstractC0090a setResolution(Size size) {
            if (size != null) {
                this.a = size;
                return this;
            }
            com.google.gson.internal.a.j("Null resolution");
            return null;
        }

        @Override // androidx.camera.core.u1.a.AbstractC0090a
        public u1.a.AbstractC0090a setRotationDegrees(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    private i(Size size, Rect rect, int i) {
        this.a = size;
        this.b = rect;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1.a) {
            u1.a aVar = (u1.a) obj;
            if (this.a.equals(aVar.getResolution()) && this.b.equals(aVar.getCropRect()) && this.c == aVar.getRotationDegrees()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.u1.a
    public Rect getCropRect() {
        return this.b;
    }

    @Override // androidx.camera.core.u1.a
    public Size getResolution() {
        return this.a;
    }

    @Override // androidx.camera.core.u1.a
    public int getRotationDegrees() {
        return this.c;
    }

    public int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.a);
        sb.append(", cropRect=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        return defpackage.a.s(sb, "}", this.c);
    }
}
