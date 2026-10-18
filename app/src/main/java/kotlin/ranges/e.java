package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class e implements f<Float> {
    private final float a;
    private final float b;

    public e(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean contains(float f) {
        return f >= this.a && f <= this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public Float getEndInclusive() {
        return Float.valueOf(this.b);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
    public Float getStart() {
        return Float.valueOf(this.a);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
    public boolean isEmpty() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.a + ".." + this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g, kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean lessThanOrEquals(float f, float f2) {
        return f <= f2;
    }
}
