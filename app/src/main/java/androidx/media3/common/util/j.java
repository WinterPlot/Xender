package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class j {
    private final g a;
    private boolean b;

    public j() {
        this(g.a);
    }

    public synchronized boolean block(long j) throws InterruptedException {
        try {
            if (j <= 0) {
                return this.b;
            }
            long jElapsedRealtime = this.a.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                block();
            } else {
                while (!this.b && jElapsedRealtime < j2) {
                    this.a.onThreadBlocked();
                    wait(j2 - jElapsedRealtime);
                    jElapsedRealtime = this.a.elapsedRealtime();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean blockUninterruptible(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            long jElapsedRealtime = this.a.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                blockUninterruptible();
            } else {
                boolean z = false;
                while (!this.b && jElapsedRealtime < j2) {
                    try {
                        this.a.onThreadBlocked();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jElapsedRealtime = this.a.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean close() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.b;
    }

    public synchronized boolean open() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public j(g gVar) {
        this.a = gVar;
    }

    public synchronized void block() throws InterruptedException {
        while (!this.b) {
            this.a.onThreadBlocked();
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.onThreadBlocked();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
