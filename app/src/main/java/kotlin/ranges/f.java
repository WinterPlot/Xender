package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {
    @Override // kotlin.ranges.g, kotlin.ranges.r
    boolean contains(T t);

    @Override // kotlin.ranges.g
    /* synthetic */ Comparable getEndInclusive();

    @Override // kotlin.ranges.g, kotlin.ranges.r
    /* synthetic */ Comparable getStart();

    @Override // kotlin.ranges.g, kotlin.ranges.r
    boolean isEmpty();

    boolean lessThanOrEquals(T t, T t2);
}
