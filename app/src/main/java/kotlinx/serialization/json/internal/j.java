package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends i {
    public static final j c = new j();

    private j() {
    }

    public final void release(char[] cArr) {
        cArr.getClass();
        if (cArr.length == 16384) {
            releaseImpl(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    public final char[] take() {
        return take(16384);
    }
}
