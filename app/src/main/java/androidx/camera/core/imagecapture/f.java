package androidx.camera.core.imagecapture;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class f extends f0 {
    private final Size a;
    private final int b;

    public f(Size size, int i) {
        if (size == null) {
            com.google.gson.internal.a.j("Null resolution");
            throw null;
        }
        this.a = size;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.a.equals(f0Var.getResolution()) && this.b == f0Var.getInputFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.f0
    public int getInputFormat() {
        return this.b;
    }

    @Override // androidx.camera.core.imagecapture.f0
    public Size getResolution() {
        return this.a;
    }

    public int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostviewSettings{resolution=");
        sb.append(this.a);
        sb.append(", inputFormat=");
        return defpackage.a.s(sb, "}", this.b);
    }
}
