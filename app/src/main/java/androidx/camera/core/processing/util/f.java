package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static f of(EGLSurface eGLSurface, int i, int i2) {
        return new c(eGLSurface, i, i2);
    }

    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
