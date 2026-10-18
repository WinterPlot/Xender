package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class h {
    private boolean c;
    private boolean d;
    private int f;
    private a a = new a();
    private a b = new a();
    private long e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        private static int getRecentFrameOutlierIndex(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.e;
            if (j == 0) {
                return 0L;
            }
            return this.f / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f;
        }

        public boolean isLastFrameOutlier() {
            long j = this.d;
            if (j == 0) {
                return false;
            }
            return this.g[getRecentFrameOutlierIndex(j - 1)];
        }

        public boolean isSynced() {
            return this.d > 15 && this.h == 0;
        }

        public void onNextFrame(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.a = j;
            } else if (j2 == 1) {
                long j3 = j - this.a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j2);
                if (Math.abs(j4 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j4;
                    boolean[] zArr = this.g;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = j;
        }

        public void reset() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    public long getFrameDurationNs() {
        if (isSynced()) {
            return this.a.getFrameDurationNs();
        }
        return -9223372036854775807L;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f;
    }

    public long getMatchingFrameDurationSumNs() {
        if (isSynced()) {
            return this.a.getMatchingFrameDurationSumNs();
        }
        return -9223372036854775807L;
    }

    public boolean isSynced() {
        return this.a.isSynced();
    }

    public void onNextFrame(long j) {
        this.a.onNextFrame(j);
        if (this.a.isSynced() && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.isLastFrameOutlier()) {
                this.b.reset();
                this.b.onNextFrame(this.e);
            }
            this.c = true;
            this.b.onNextFrame(j);
        }
        if (this.c && this.b.isSynced()) {
            a aVar = this.a;
            this.a = this.b;
            this.b = aVar;
            this.c = false;
            this.d = false;
        }
        this.e = j;
        this.f = this.a.isSynced() ? 0 : this.f + 1;
    }

    public void reset() {
        this.a.reset();
        this.b.reset();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }
}
