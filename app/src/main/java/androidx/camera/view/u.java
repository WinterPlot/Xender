package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    final OrientationEventListener b;
    final Object a = new Object();
    final Map<b, c> c = new HashMap();
    boolean d = false;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends OrientationEventListener {
        private int a;

        public a(Context context) {
            super(context);
            this.a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int iOrientationToSurfaceRotation;
            ArrayList arrayList;
            if (i == -1 || this.a == (iOrientationToSurfaceRotation = u.orientationToSurfaceRotation(i))) {
                return;
            }
            this.a = iOrientationToSurfaceRotation;
            synchronized (u.this.a) {
                arrayList = new ArrayList(u.this.c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((c) obj).onRotationChanged(iOrientationToSurfaceRotation);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void onRotationChanged(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private final b a;
        private final Executor b;
        private final AtomicBoolean c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.a = bVar;
            this.b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRotationChanged$0(int i) {
            if (this.c.get()) {
                ((androidx.camera.view.b) this.a).onRotationChanged(i);
            }
        }

        public void disable() {
            this.c.set(false);
        }

        public void onRotationChanged(final int i) {
            this.b.execute(new Runnable() { // from class: androidx.camera.view.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onRotationChanged$0(i);
                }
            });
        }
    }

    public u(Context context) {
        this.b = new a(context);
    }

    public static int orientationToSurfaceRotation(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    public boolean addListener(Executor executor, b bVar) {
        synchronized (this.a) {
            try {
                if (!this.b.canDetectOrientation() && !this.d) {
                    return false;
                }
                this.c.put(bVar, new c(bVar, executor));
                this.b.enable();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(b bVar) {
        synchronized (this.a) {
            try {
                c cVar = this.c.get(bVar);
                if (cVar != null) {
                    cVar.disable();
                    this.c.remove(bVar);
                }
                if (this.c.isEmpty()) {
                    this.b.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
