package kotlin.comparisons;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class f extends e {
    public static final <T> T maxOf(T t, T[] tArr, Comparator<? super T> comparator) {
        tArr.getClass();
        comparator.getClass();
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T minOf(T t, T[] tArr, Comparator<? super T> comparator) {
        tArr.getClass();
        comparator.getClass();
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T maxOf(T t, T t2, Comparator<? super T> comparator) {
        comparator.getClass();
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    public static final <T> T minOf(T t, T t2, Comparator<? super T> comparator) {
        comparator.getClass();
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    public static final <T> T maxOf(T t, T t2, T t3, Comparator<? super T> comparator) {
        comparator.getClass();
        return (T) maxOf(t, maxOf(t2, t3, comparator), comparator);
    }

    public static final <T> T minOf(T t, T t2, T t3, Comparator<? super T> comparator) {
        comparator.getClass();
        return (T) minOf(t, minOf(t2, t3, comparator), comparator);
    }
}
