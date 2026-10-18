package androidx.work.impl.background.greedy;

import androidx.activity.f;
import androidx.work.impl.r0;
import androidx.work.impl.w;
import androidx.work.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private final z a;
    private final r0 b;
    private final long c;
    private final Object d;
    private final Map<w, Runnable> e;

    public c(z zVar, r0 r0Var, long j) {
        zVar.getClass();
        r0Var.getClass();
        this.a = zVar;
        this.b = r0Var;
        this.c = j;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void track$lambda$0(c cVar, w wVar) {
        cVar.b.stopWork(wVar, 3);
    }

    public final void cancel(w wVar) {
        Runnable runnableRemove;
        wVar.getClass();
        synchronized (this.d) {
            runnableRemove = this.e.remove(wVar);
        }
        if (runnableRemove != null) {
            this.a.cancel(runnableRemove);
        }
    }

    public final void track(w wVar) {
        wVar.getClass();
        f fVar = new f(this, wVar, 28);
        synchronized (this.d) {
            this.e.put(wVar, fVar);
        }
        this.a.scheduleWithDelay(this.c, fVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(z zVar, r0 r0Var) {
        this(zVar, r0Var, 0L, 4, null);
        zVar.getClass();
        r0Var.getClass();
    }

    public /* synthetic */ c(z zVar, r0 r0Var, long j, int i, r rVar) {
        this(zVar, r0Var, (i & 4) != 0 ? 5400000L : j);
    }
}
