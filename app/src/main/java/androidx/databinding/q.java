package androidx.databinding;

import androidx.lifecycle.x;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class q<T> extends WeakReference<o> {
    private final l<T> a;
    protected final int b;
    private T c;

    public q(o oVar, int i, l<T> lVar, ReferenceQueue<o> referenceQueue) {
        super(oVar, referenceQueue);
        this.b = i;
        this.a = lVar;
    }

    public o getBinder() {
        o oVar = (o) get();
        if (oVar == null) {
            unregister();
        }
        return oVar;
    }

    public T getTarget() {
        return this.c;
    }

    public void setLifecycleOwner(x xVar) {
        this.a.setLifecycleOwner(xVar);
    }

    public void setTarget(T t) {
        unregister();
        this.c = t;
        if (t != null) {
            this.a.addListener(t);
        }
    }

    public boolean unregister() {
        boolean z;
        T t = this.c;
        if (t != null) {
            this.a.removeListener(t);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
