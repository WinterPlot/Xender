package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b;
    private Runnable c;
    private final Object d;

    public c0(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque<>();
        this.d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable runnable, c0 c0Var) {
        try {
            runnable.run();
        } finally {
            c0Var.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            try {
                this.b.offer(new androidx.activity.f(runnable, this, 26));
                if (this.c == null) {
                    scheduleNext();
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.d) {
            try {
                Runnable runnablePoll = this.b.poll();
                Runnable runnable = runnablePoll;
                this.c = runnable;
                if (runnablePoll != null) {
                    this.a.execute(runnable);
                }
                kotlin.y yVar = kotlin.y.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
