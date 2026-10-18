package okio.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public static final int combineSurrogates(int i, int i2) {
        return (((i & 1023) << 10) | (i2 & 1023)) + 65536;
    }

    public static final boolean isHighSurrogate(int i) {
        return 55296 <= i && i < 56320;
    }

    public static final boolean isLowSurrogate(int i) {
        return 56320 <= i && i < 57344;
    }

    public static final boolean isSurrogate(int i) {
        return 55296 <= i && i < 57344;
    }
}
