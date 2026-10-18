package androidx.camera.core.impl.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class m {
    private final long a;
    private final long b;

    public m(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    public long getDenominator() {
        return this.b;
    }

    public long getNumerator() {
        return this.a;
    }

    public double toDouble() {
        return this.a / this.b;
    }

    public String toString() {
        return this.a + "/" + this.b;
    }

    public m(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
