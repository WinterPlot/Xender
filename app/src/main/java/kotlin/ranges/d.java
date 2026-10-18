package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class d implements f<Double> {
    private final double a;
    private final double b;

    public d(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public boolean contains(double d) {
        return d >= this.a && d <= this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public Double getEndInclusive() {
        return Double.valueOf(this.b);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
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

    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.a + ".." + this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }
}
