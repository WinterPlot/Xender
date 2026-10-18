package androidx.camera.core;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class e1 {
    public static final e1 d = new e1(-1, -1);
    private final long a;
    private final long b;
    private final long c;

    public e1(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = computeTotalCaptureLatencyMillis(j, j2);
    }

    private long computeTotalCaptureLatencyMillis(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return -1L;
        }
        return j + j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.a == e1Var.getCaptureLatencyMillis() && this.b == e1Var.getProcessingLatencyMillis() && this.c == e1Var.getTotalCaptureLatencyMillis();
    }

    public long getCaptureLatencyMillis() {
        return this.a;
    }

    public long getProcessingLatencyMillis() {
        return this.b;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }

    public String toString() {
        return "captureLatencyMillis=" + this.a + ", processingLatencyMillis=" + this.b + ", totalCaptureLatencyMillis=" + this.c;
    }
}
