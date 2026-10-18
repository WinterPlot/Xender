package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static final kotlinx.coroutines.internal.g0 a = new kotlinx.coroutines.internal.g0("RESUME_TOKEN");

    private static final int decisionAndIndex(int i, int i2) {
        return (i << 29) + i2;
    }

    private static final int getDecision(int i) {
        return i >> 29;
    }

    private static final int getIndex(int i) {
        return i & 536870911;
    }
}
