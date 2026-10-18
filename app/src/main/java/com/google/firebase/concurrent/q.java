package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class q implements p {
    private volatile boolean a;
    private final Executor b;
    final LinkedBlockingQueue<Runnable> c = new LinkedBlockingQueue<>();

    public q(boolean z, Executor executor) {
        this.a = z;
        this.b = executor;
    }

    private void maybeEnqueueNext() {
        if (this.a) {
            return;
        }
        Runnable runnablePoll = this.c.poll();
        while (runnablePoll != null) {
            this.b.execute(runnablePoll);
            runnablePoll = !this.a ? this.c.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.c.offer(runnable);
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.p
    public boolean isPaused() {
        return this.a;
    }

    @Override // com.google.firebase.concurrent.p
    public void pause() {
        this.a = true;
    }

    @Override // com.google.firebase.concurrent.p
    public void resume() {
        this.a = false;
        maybeEnqueueNext();
    }
}
