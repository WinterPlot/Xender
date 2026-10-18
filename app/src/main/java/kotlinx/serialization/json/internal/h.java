package kotlinx.serialization.json.internal;

import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends i {
    public static final h c = new h();

    private h() {
    }

    public final void release(char[] cArr) {
        cArr.getClass();
        releaseImpl(cArr);
    }

    public final char[] take() {
        return take(Uuid.SIZE_BITS);
    }
}
