package androidx.camera.camera2.pipe.core;

import android.os.SystemClock;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final a c = new a(null);
    private final long a;
    private final long b;

    private k(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static final k estimate() {
        return c.estimate();
    }

    private static final long estimateRealtimeNsToMonotonicNs() {
        return c.estimateRealtimeNsToMonotonicNs();
    }

    private static final long estimateRealtimeNsToUtcMs() {
        return c.estimateRealtimeNsToUtcMs();
    }

    public static final k fixed(long j, long j2) {
        return c.fixed(j, j2);
    }

    public static final long monotonicMsToRealtimeMs(k kVar, long j) {
        return c.monotonicMsToRealtimeMs(kVar, j);
    }

    public static final long monotonicMsToRealtimeNs(k kVar, long j) {
        return c.monotonicMsToRealtimeNs(kVar, j);
    }

    public static final long monotonicMsToUtcMs(k kVar, long j) {
        return c.monotonicMsToUtcMs(kVar, j);
    }

    public static final long monotonicNsToRealtimeMs(k kVar, long j) {
        return c.monotonicNsToRealtimeMs(kVar, j);
    }

    public static final long monotonicNsToRealtimeNs(k kVar, long j) {
        return c.monotonicNsToRealtimeNs(kVar, j);
    }

    public static final long monotonicNsToUtcMs(k kVar, long j) {
        return c.monotonicNsToUtcMs(kVar, j);
    }

    public static final long realtimeMsToMonotonicMs(k kVar, long j) {
        return c.realtimeMsToMonotonicMs(kVar, j);
    }

    public static final long realtimeMsToMonotonicNs(k kVar, long j) {
        return c.realtimeMsToMonotonicNs(kVar, j);
    }

    public static final long realtimeMsToUtcMs(k kVar, long j) {
        return c.realtimeMsToUtcMs(kVar, j);
    }

    public static final long realtimeNsToMonotonicMs(k kVar, long j) {
        return c.realtimeNsToMonotonicMs(kVar, j);
    }

    public static final long realtimeNsToMonotonicNs(k kVar, long j) {
        return c.realtimeNsToMonotonicNs(kVar, j);
    }

    public static final long realtimeNsToUtcMs(k kVar, long j) {
        return c.realtimeNsToUtcMs(kVar, j);
    }

    public final long getRealtimeNsToMonotonicNs() {
        return this.b;
    }

    public final long getRealtimeNsToUtcMs() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long estimateRealtimeNsToMonotonicNs() {
            long j = Long.MAX_VALUE;
            long j2 = 0;
            for (int i = 0; i < 3; i++) {
                long jNanoTime = System.nanoTime();
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jNanoTime2 = System.nanoTime();
                long j3 = jNanoTime2 - jNanoTime;
                if (j3 < j) {
                    j2 = jElapsedRealtimeNanos - ((jNanoTime + jNanoTime2) / 2);
                    j = j3;
                }
            }
            return j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long estimateRealtimeNsToUtcMs() {
            long j = Long.MAX_VALUE;
            long j2 = 0;
            for (int i = 0; i < 3; i++) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                long j3 = jElapsedRealtimeNanos2 - jElapsedRealtimeNanos;
                if (j3 < j) {
                    j2 = ((jElapsedRealtimeNanos + jElapsedRealtimeNanos2) / 2000000) - jCurrentTimeMillis;
                    j = j3;
                }
            }
            return j2;
        }

        public final k estimate() {
            return new k(estimateRealtimeNsToUtcMs(), estimateRealtimeNsToMonotonicNs(), null);
        }

        public final k fixed(long j, long j2) {
            return new k(j, j2, null);
        }

        public final long monotonicMsToRealtimeMs(k kVar, long j) {
            kVar.getClass();
            return monotonicMsToRealtimeNs(kVar, j) / 1000000;
        }

        public final long monotonicMsToRealtimeNs(k kVar, long j) {
            kVar.getClass();
            return (j * 1000000) + kVar.getRealtimeNsToMonotonicNs();
        }

        public final long monotonicMsToUtcMs(k kVar, long j) {
            kVar.getClass();
            return realtimeNsToUtcMs(kVar, monotonicMsToRealtimeNs(kVar, j));
        }

        public final long monotonicNsToRealtimeMs(k kVar, long j) {
            kVar.getClass();
            return monotonicNsToRealtimeNs(kVar, j) / 1000000;
        }

        public final long monotonicNsToRealtimeNs(k kVar, long j) {
            kVar.getClass();
            return kVar.getRealtimeNsToMonotonicNs() + j;
        }

        public final long monotonicNsToUtcMs(k kVar, long j) {
            kVar.getClass();
            return realtimeNsToUtcMs(kVar, monotonicNsToRealtimeNs(kVar, j));
        }

        public final long realtimeMsToMonotonicMs(k kVar, long j) {
            kVar.getClass();
            return realtimeMsToMonotonicNs(kVar, j) / 1000000;
        }

        public final long realtimeMsToMonotonicNs(k kVar, long j) {
            kVar.getClass();
            return (j * 1000000) - kVar.getRealtimeNsToMonotonicNs();
        }

        public final long realtimeMsToUtcMs(k kVar, long j) {
            kVar.getClass();
            return j - kVar.getRealtimeNsToUtcMs();
        }

        public final long realtimeNsToMonotonicMs(k kVar, long j) {
            kVar.getClass();
            return realtimeNsToMonotonicNs(kVar, j) / 1000000;
        }

        public final long realtimeNsToMonotonicNs(k kVar, long j) {
            kVar.getClass();
            return j - kVar.getRealtimeNsToMonotonicNs();
        }

        public final long realtimeNsToUtcMs(k kVar, long j) {
            kVar.getClass();
            return (j / 1000000) - kVar.getRealtimeNsToUtcMs();
        }

        private a() {
        }
    }

    public /* synthetic */ k(long j, long j2, r rVar) {
        this(j, j2);
    }
}
