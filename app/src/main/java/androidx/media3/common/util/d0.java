package androidx.media3.common.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0<R, E extends Exception> implements RunnableFuture<R> {
    private final j a = new j();
    private final j b = new j();
    private final Object c = new Object();
    private Exception d;
    private R e;
    private Thread f;
    private boolean g;

    private R getResult() throws ExecutionException {
        if (this.g) {
            throw new CancellationException();
        }
        Exception exc = this.d;
        if (exc == null) {
            return this.e;
        }
        throw new ExecutionException(exc);
    }

    public final void blockUntilFinished() {
        this.b.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.a.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.c) {
            try {
                if (!this.g && !this.b.isOpen()) {
                    this.g = true;
                    cancelWork();
                    Thread thread = this.f;
                    if (thread == null) {
                        this.a.open();
                        this.b.open();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract R doWork() throws Exception;

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.b.block(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return getResult();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                if (this.g) {
                    return;
                }
                this.f = Thread.currentThread();
                this.a.open();
                try {
                    try {
                        this.e = doWork();
                        synchronized (this.c) {
                            this.b.open();
                            this.f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.b.open();
                            this.f = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.b.open();
                        this.f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelWork() {
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.b.block();
        return getResult();
    }
}
