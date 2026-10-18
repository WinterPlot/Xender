package com.google.firebase.concurrent;

import com.google.firebase.components.v;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class l implements Executor {
    private final Executor a;
    private final Semaphore b;
    private final LinkedBlockingQueue<Runnable> c = new LinkedBlockingQueue<>();

    public l(Executor executor, int i) {
        v.checkArgument(i > 0, "concurrency must be positive.");
        this.a = executor;
        this.b = new Semaphore(i, true);
    }

    private Runnable decorate(Runnable runnable) {
        return new a(this, runnable, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decorate$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.b.release();
            maybeEnqueueNext();
        }
    }

    private void maybeEnqueueNext() {
        while (this.b.tryAcquire()) {
            Runnable runnablePoll = this.c.poll();
            if (runnablePoll == null) {
                this.b.release();
                return;
            }
            this.a.execute(decorate(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.c.offer(runnable);
        maybeEnqueueNext();
    }
}
