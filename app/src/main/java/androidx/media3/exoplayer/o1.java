package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.IllegalSeekPositionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    private final b a;
    private final a b;
    private final androidx.media3.common.util.g c;
    private final androidx.media3.common.k0 d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void sendMessage(o1 o1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public o1(a aVar, b bVar, androidx.media3.common.k0 k0Var, int i, androidx.media3.common.util.g gVar, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = k0Var;
        this.g = looper;
        this.c = gVar;
        this.h = i;
    }

    public synchronized boolean blockUntilDelivered(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            com.google.common.base.m.checkState(this.k);
            com.google.common.base.m.checkState(this.g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.c.elapsedRealtime() + j;
            while (true) {
                z = this.m;
                if (z || j <= 0) {
                    break;
                }
                this.c.onThreadBlocked();
                wait(j);
                j = jElapsedRealtime - this.c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public synchronized o1 cancel() {
        com.google.common.base.m.checkState(this.k);
        this.n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.j;
    }

    public Looper getLooper() {
        return this.g;
    }

    public int getMediaItemIndex() {
        return this.h;
    }

    public Object getPayload() {
        return this.f;
    }

    public long getPositionMs() {
        return this.i;
    }

    public b getTarget() {
        return this.a;
    }

    public androidx.media3.common.k0 getTimeline() {
        return this.d;
    }

    public int getType() {
        return this.e;
    }

    public synchronized boolean isCanceled() {
        return this.n;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public o1 send() {
        com.google.common.base.m.checkState(!this.k);
        if (this.i == -9223372036854775807L) {
            com.google.common.base.m.checkArgument(this.j);
        }
        this.k = true;
        this.b.sendMessage(this);
        return this;
    }

    public o1 setDeleteAfterDelivery(boolean z) {
        com.google.common.base.m.checkState(!this.k);
        this.j = z;
        return this;
    }

    public o1 setLooper(Looper looper) {
        com.google.common.base.m.checkState(!this.k);
        this.g = looper;
        return this;
    }

    public o1 setPayload(Object obj) {
        com.google.common.base.m.checkState(!this.k);
        this.f = obj;
        return this;
    }

    public o1 setPosition(int i, long j) {
        com.google.common.base.m.checkState(!this.k);
        com.google.common.base.m.checkArgument(j != -9223372036854775807L);
        if (i < 0 || (!this.d.isEmpty() && i >= this.d.getWindowCount())) {
            throw new IllegalSeekPositionException(this.d, i, j);
        }
        this.h = i;
        this.i = j;
        return this;
    }

    public o1 setType(int i) {
        com.google.common.base.m.checkState(!this.k);
        this.e = i;
        return this;
    }

    public o1 setPosition(long j) {
        com.google.common.base.m.checkState(!this.k);
        this.i = j;
        return this;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            com.google.common.base.m.checkState(this.k);
            com.google.common.base.m.checkState(this.g.getThread() != Thread.currentThread());
            while (!this.m) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }
}
