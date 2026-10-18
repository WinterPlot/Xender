package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class j implements j0 {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;
    private final boolean h;

    public j(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = getTimeUsAtPosition(j, j2, i);
        }
    }

    private long getFramePositionForTimeUs(long j) {
        long j2 = (j * ((long) this.e)) / 8000000;
        int i = this.c;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.d;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.b + Math.max(jMin, 0L);
    }

    private static long getTimeUsAtPosition(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // androidx.media3.extractor.j0
    public long getDurationUs() {
        return this.f;
    }

    @Override // androidx.media3.extractor.j0
    public j0.a getSeekPoints(long j) {
        if (this.d == -1 && !this.g) {
            return new j0.a(new k0(0L, this.b));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        k0 k0Var = new k0(timeUsAtPosition, framePositionForTimeUs);
        if (this.d != -1 && timeUsAtPosition < j) {
            int i = this.c;
            if (((long) i) + framePositionForTimeUs < this.a) {
                long j2 = framePositionForTimeUs + ((long) i);
                return new j0.a(k0Var, new k0(getTimeUsAtPosition(j2), j2));
            }
        }
        return new j0.a(k0Var);
    }

    @Override // androidx.media3.extractor.j0
    public boolean isEstimated() {
        return this.h;
    }

    @Override // androidx.media3.extractor.j0
    public boolean isSeekable() {
        return this.d != -1 || this.g;
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.b, this.e);
    }

    public j(long j, long j2, int i, int i2, boolean z) {
        this(j, j2, i, i2, z, true);
    }

    public j(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }
}
