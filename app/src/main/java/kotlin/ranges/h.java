package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class h<T extends Comparable<? super T>> implements r<T> {
    private final T a;
    private final T b;

    public h(T t, T t2) {
        t.getClass();
        t2.getClass();
        this.a = t;
        this.b = t2;
    }

    @Override // kotlin.ranges.r
    public /* bridge */ boolean contains(T t) {
        return r.a.contains(this, t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.y.areEqual(getStart(), hVar.getStart()) && kotlin.jvm.internal.y.areEqual(getEndExclusive(), hVar.getEndExclusive());
    }

    @Override // kotlin.ranges.r
    public T getEndExclusive() {
        return this.b;
    }

    @Override // kotlin.ranges.r
    public T getStart() {
        return this.a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getEndExclusive().hashCode() + (getStart().hashCode() * 31);
    }

    @Override // kotlin.ranges.r
    public /* bridge */ boolean isEmpty() {
        return r.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
