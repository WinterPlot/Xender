package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class p implements r<Double> {
    private final double a;
    private final double b;

    public p(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    private final boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }

    public boolean contains(double d) {
        return d >= this.a && d < this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (isEmpty() && ((p) obj).isEmpty()) {
            return true;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b;
    }

    @Override // kotlin.ranges.r
    public Double getEndExclusive() {
        return Double.valueOf(this.b);
    }

    @Override // kotlin.ranges.r
    public Double getStart() {
        return Double.valueOf(this.a);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        return this.a >= this.b;
    }

    public String toString() {
        return this.a + "..<" + this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }
}
