package androidx.camera.core;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b2 implements androidx.camera.core.impl.s1 {
    private final androidx.camera.core.impl.s1 d;
    private final Surface e;
    private q0.a f;
    private final Object a = new Object();
    private int b = 0;
    private boolean c = false;
    private final q0.a g = new y0(this, 1);

    public b2(androidx.camera.core.impl.s1 s1Var) {
        this.d = s1Var;
        this.e = s1Var.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(i1 i1Var) {
        q0.a aVar;
        synchronized (this.a) {
            try {
                int i = this.b - 1;
                this.b = i;
                if (this.c && i == 0) {
                    close();
                }
                aVar = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.onImageClose(i1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(androidx.camera.core.impl.s1.a aVar, androidx.camera.core.impl.s1 s1Var) {
        aVar.onImageAvailable(this);
    }

    private i1 wrapImageProxy(i1 i1Var) {
        if (i1Var == null) {
            return null;
        }
        this.b++;
        e2 e2Var = new e2(i1Var);
        e2Var.addOnImageCloseListener(this.g);
        return e2Var;
    }

    @Override // androidx.camera.core.impl.s1
    public i1 acquireLatestImage() {
        i1 i1VarWrapImageProxy;
        synchronized (this.a) {
            i1VarWrapImageProxy = wrapImageProxy(this.d.acquireLatestImage());
        }
        return i1VarWrapImageProxy;
    }

    @Override // androidx.camera.core.impl.s1
    public i1 acquireNextImage() {
        i1 i1VarWrapImageProxy;
        synchronized (this.a) {
            i1VarWrapImageProxy = wrapImageProxy(this.d.acquireNextImage());
        }
        return i1VarWrapImageProxy;
    }

    @Override // androidx.camera.core.impl.s1
    public void clearOnImageAvailableListener() {
        synchronized (this.a) {
            this.d.clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getCapacity() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.d.getMaxImages() - this.b;
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.s1
    public int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.s1
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.a) {
            imageFormat = this.d.getImageFormat();
        }
        return imageFormat;
    }

    public androidx.camera.core.impl.s1 getImageReaderProxy() {
        androidx.camera.core.impl.s1 s1Var;
        synchronized (this.a) {
            s1Var = this.d;
        }
        return s1Var;
    }

    @Override // androidx.camera.core.impl.s1
    public int getMaxImages() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.d.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.s1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.s1
    public int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.d.getWidth();
        }
        return width;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public void safeClose() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.d.clearOnImageAvailableListener();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void setOnImageAvailableListener(final androidx.camera.core.impl.s1.a aVar, Executor executor) {
        synchronized (this.a) {
            this.d.setOnImageAvailableListener(new androidx.camera.core.impl.s1.a() { // from class: androidx.camera.core.a2
                @Override // androidx.camera.core.impl.s1.a
                public final void onImageAvailable(androidx.camera.core.impl.s1 s1Var) {
                    this.a.lambda$setOnImageAvailableListener$1(aVar, s1Var);
                }
            }, executor);
        }
    }

    public void setOnImageCloseListener(q0.a aVar) {
        synchronized (this.a) {
            this.f = aVar;
        }
    }
}
