package androidx.camera.core;

import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.w2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface x1 {
    public static final x1 a = new v1();
    public static final x1 b = new androidx.camera.core.impl.r0.b(6000L);
    public static final x1 c = new androidx.camera.core.impl.r0(6000L);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final x1 a;
        private long b;

        public b(x1 x1Var) {
            this.a = x1Var;
            this.b = x1Var.getTimeoutInMillis();
        }

        public x1 build() {
            x1 x1Var = this.a;
            return x1Var instanceof n2 ? ((n2) x1Var).copy(this.b) : new w2(this.b, x1Var);
        }

        public b setTimeoutInMillis(long j) {
            this.b = j;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    long getTimeoutInMillis();

    d onRetryDecisionRequested(c cVar);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d {
        public static final d d = new d(false, 0);
        public static final d e = new d(true);
        public static final d f = new d(true, 100);
        public static d g = new d(false, 0L, true);
        private final long a;
        private final boolean b;
        private final boolean c;

        private d(boolean z, long j, boolean z2) {
            this.b = z;
            this.a = j;
            if (z2) {
                androidx.core.util.i.checkArgument(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.c = z2;
        }

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        public long getRetryDelayInMillis() {
            return this.a;
        }

        public boolean shouldCompleteWithoutFailure() {
            return this.c;
        }

        public boolean shouldRetry() {
            return this.b;
        }

        private d(boolean z) {
            this(z, getDefaultRetryDelayInMillis());
        }

        private d(boolean z, long j) {
            this(z, j, false);
        }
    }
}
