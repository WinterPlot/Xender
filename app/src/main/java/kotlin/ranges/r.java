package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface r<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean contains(r<T> rVar, T t) {
            t.getClass();
            return t.compareTo(rVar.getStart()) >= 0 && t.compareTo(rVar.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(r<T> rVar) {
            return rVar.getStart().compareTo(rVar.getEndExclusive()) >= 0;
        }
    }

    boolean contains(T t);

    T getEndExclusive();

    T getStart();

    boolean isEmpty();
}
