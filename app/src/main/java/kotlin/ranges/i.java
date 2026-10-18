package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class i<T extends Comparable<? super T>> implements g<T> {
    private final T a;
    private final T b;

    public i(T t, T t2) {
        t.getClass();
        t2.getClass();
        this.a = t;
        this.b = t2;
    }

    @Override // kotlin.ranges.g, kotlin.ranges.r
    public /* bridge */ boolean contains(T t) {
        return g.a.contains(this, t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.y.areEqual(getStart(), iVar.getStart()) && kotlin.jvm.internal.y.areEqual(getEndInclusive(), iVar.getEndInclusive());
    }

    @Override // kotlin.ranges.g
    public T getEndInclusive() {
        return this.b;
    }

    @Override // kotlin.ranges.g, kotlin.ranges.r
    public T getStart() {
        return this.a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getEndInclusive().hashCode() + (getStart().hashCode() * 31);
    }

    @Override // kotlin.ranges.g, kotlin.ranges.r
    public /* bridge */ boolean isEmpty() {
        return g.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
