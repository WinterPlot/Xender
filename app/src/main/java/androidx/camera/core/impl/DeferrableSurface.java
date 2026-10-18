package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurface {
    public static final Size k = new Size(0, 0);
    private static final boolean l = androidx.camera.core.n1.isDebugEnabled("DeferrableSurface");
    private static final AtomicInteger m = new AtomicInteger(0);
    private static final AtomicInteger n = new AtomicInteger(0);
    private final Object a;
    private int b;
    private boolean c;
    private CallbackToFutureAdapter.a<Void> d;
    private final ListenableFuture<Void> e;
    private CallbackToFutureAdapter.a<Void> f;
    private final ListenableFuture<Void> g;
    private final Size h;
    private final int i;
    Class<?> j;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface(Size size, int i) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.h = size;
        this.i = i;
        final int i2 = 0;
        ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.b(this) { // from class: androidx.camera.core.impl.d1
            public final /* synthetic */ DeferrableSurface b;

            {
                this.b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                int i3 = i2;
                DeferrableSurface deferrableSurface = this.b;
                switch (i3) {
                    case 0:
                        return deferrableSurface.lambda$new$0(aVar);
                    default:
                        return deferrableSurface.lambda$new$1(aVar);
                }
            }
        });
        this.e = future;
        final int i3 = 1;
        this.g = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.b(this) { // from class: androidx.camera.core.impl.d1
            public final /* synthetic */ DeferrableSurface b;

            {
                this.b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                int i4 = i3;
                DeferrableSurface deferrableSurface = this.b;
                switch (i4) {
                    case 0:
                        return deferrableSurface.lambda$new$0(aVar);
                    default:
                        return deferrableSurface.lambda$new$1(aVar);
                }
            }
        });
        if (androidx.camera.core.n1.isDebugEnabled("DeferrableSurface")) {
            printGlobalDebugCounts("Surface created", n.incrementAndGet(), m.get());
            future.addListener(new m0(this, Log.getStackTraceString(new Exception()), 5), androidx.camera.core.impl.utils.executor.c.directExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.a aVar) throws Exception {
        synchronized (this.a) {
            this.d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1(CallbackToFutureAdapter.a aVar) throws Exception {
        synchronized (this.a) {
            this.f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(String str) {
        try {
            this.e.get();
            printGlobalDebugCounts("Surface terminated", n.decrementAndGet(), m.get());
        } catch (Exception e) {
            androidx.camera.core.n1.e("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.c), Integer.valueOf(this.b)), e);
            }
        }
    }

    private void printGlobalDebugCounts(String str, int i, int i2) {
        if (!l && androidx.camera.core.n1.isDebugEnabled("DeferrableSurface")) {
            androidx.camera.core.n1.d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.n1.d("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public void close() {
        CallbackToFutureAdapter.a<Void> aVar;
        synchronized (this.a) {
            try {
                if (this.c) {
                    aVar = null;
                } else {
                    this.c = true;
                    this.f.set(null);
                    if (this.b == 0) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (androidx.camera.core.n1.isDebugEnabled("DeferrableSurface")) {
                        androidx.camera.core.n1.d("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.set(null);
        }
    }

    public void decrementUseCount() {
        CallbackToFutureAdapter.a<Void> aVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    aVar = this.d;
                    this.d = null;
                } else {
                    aVar = null;
                }
                if (androidx.camera.core.n1.isDebugEnabled("DeferrableSurface")) {
                    androidx.camera.core.n1.d("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        printGlobalDebugCounts("Surface no longer in use", n.get(), m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.set(null);
        }
    }

    public ListenableFuture<Void> getCloseFuture() {
        return androidx.camera.core.impl.utils.futures.k.nonCancellationPropagating(this.g);
    }

    public Class<?> getContainerClass() {
        return this.j;
    }

    public Size getPrescribedSize() {
        return this.h;
    }

    public int getPrescribedStreamFormat() {
        return this.i;
    }

    public final ListenableFuture<Surface> getSurface() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return androidx.camera.core.impl.utils.futures.k.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ListenableFuture<Void> getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.k.nonCancellationPropagating(this.e);
    }

    public int getUseCount() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public void incrementUseCount() throws SurfaceClosedException {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (androidx.camera.core.n1.isDebugEnabled("DeferrableSurface")) {
                    if (this.b == 1) {
                        printGlobalDebugCounts("New surface in use", n.get(), m.incrementAndGet());
                    }
                    androidx.camera.core.n1.d("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public abstract ListenableFuture<Surface> provideSurface();

    public void setContainerClass(Class<?> cls) {
        this.j = cls;
    }

    public DeferrableSurface() {
        this(k, 0);
    }
}
