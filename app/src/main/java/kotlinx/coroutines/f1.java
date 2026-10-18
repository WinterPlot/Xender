package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f1 {
    private static final kotlinx.coroutines.internal.g0 a = new kotlinx.coroutines.internal.g0("REMOVED_TASK");
    private static final kotlinx.coroutines.internal.g0 b = new kotlinx.coroutines.internal.g0("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j) {
        return j / 1000000;
    }

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
