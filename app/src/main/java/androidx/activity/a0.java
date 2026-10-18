package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private final Executor a;
    private final kotlin.jvm.functions.a<kotlin.y> b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List<kotlin.jvm.functions.a<kotlin.y>> g;
    private final Runnable h;

    public a0(Executor executor, kotlin.jvm.functions.a<kotlin.y> aVar) {
        executor.getClass();
        aVar.getClass();
        this.a = executor;
        this.b = aVar;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new l(this, 2);
    }

    private final void postWhenReportersAreDone() {
        if (this.e || this.d != 0) {
            return;
        }
        this.e = true;
        this.a.execute(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$0(a0 a0Var) {
        synchronized (a0Var.c) {
            try {
                a0Var.e = false;
                if (a0Var.d == 0 && !a0Var.f) {
                    a0Var.b.invoke();
                    a0Var.fullyDrawnReported();
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(kotlin.jvm.functions.a<kotlin.y> aVar) {
        boolean z;
        aVar.getClass();
        synchronized (this.c) {
            if (this.f) {
                z = true;
            } else {
                this.g.add(aVar);
                z = false;
            }
        }
        if (z) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.c) {
            try {
                if (!this.f) {
                    this.d++;
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator<T> it = this.g.iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.a) it.next()).invoke();
                }
                this.g.clear();
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(kotlin.jvm.functions.a<kotlin.y> aVar) {
        aVar.getClass();
        synchronized (this.c) {
            this.g.remove(aVar);
            kotlin.y yVar = kotlin.y.a;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.c) {
            try {
                if (!this.f && (i = this.d) > 0) {
                    this.d = i - 1;
                    postWhenReportersAreDone();
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
