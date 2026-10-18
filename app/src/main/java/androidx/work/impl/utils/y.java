package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class y implements androidx.work.impl.utils.taskexecutor.a {
    private final Executor b;
    private Runnable c;
    private final ArrayDeque<a> a = new ArrayDeque<>();
    final Object d = new Object();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a implements Runnable {
        final y a;
        final Runnable b;

        public a(y yVar, Runnable runnable) {
            this.a = yVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.a.d) {
                    this.a.scheduleNext();
                }
            } catch (Throwable th) {
                synchronized (this.a.d) {
                    this.a.scheduleNext();
                    throw th;
                }
            }
        }
    }

    public y(Executor executor) {
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.a.add(new a(this, runnable));
                if (this.c == null) {
                    scheduleNext();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Executor getDelegatedExecutor() {
        return this.b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.d) {
            z = !this.a.isEmpty();
        }
        return z;
    }

    public void scheduleNext() {
        a aVarPoll = this.a.poll();
        this.c = aVarPoll;
        if (aVarPoll != null) {
            this.b.execute(aVarPoll);
        }
    }
}
