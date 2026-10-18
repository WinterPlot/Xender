package androidx.media3.muxer;

import androidx.media3.common.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class MuxerException extends Exception {
    static {
        y.registerModule("media3.muxer");
    }

    public MuxerException(String str, Throwable th) {
        super(str, th);
    }
}
