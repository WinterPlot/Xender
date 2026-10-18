package okhttp3.internal.http2.flowcontrol;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private final int a;
    private long b;
    private long c;

    public a(int i) {
        this.a = i;
    }

    public static /* synthetic */ void update$default(a aVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        aVar.update(j, j2);
    }

    public final long getAcknowledged() {
        return this.c;
    }

    public final int getStreamId() {
        return this.a;
    }

    public final long getTotal() {
        return this.b;
    }

    public final synchronized long getUnacknowledged() {
        return this.b - this.c;
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + getUnacknowledged() + ')';
    }

    public final synchronized void update(long j, long j2) {
        try {
            if (j < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j2 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j3 = this.b + j;
            this.b = j3;
            long j4 = this.c + j2;
            this.c = j4;
            if (j4 > j3) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
