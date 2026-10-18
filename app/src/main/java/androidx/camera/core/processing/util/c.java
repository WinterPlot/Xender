package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class c extends f {
    private final EGLSurface a;
    private final int b;
    private final int c;

    public c(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            com.google.gson.internal.a.j("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.getEglSurface()) && this.b == fVar.getWidth() && this.c == fVar.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.f
    public EGLSurface getEglSurface() {
        return this.a;
    }

    @Override // androidx.camera.core.processing.util.f
    public int getHeight() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.f
    public int getWidth() {
        return this.b;
    }

    public int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return defpackage.a.s(sb, "}", this.c);
    }
}
