package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements e0, androidx.arch.core.util.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ y(Object obj) {
        this.a = obj;
    }

    @Override // androidx.arch.core.util.a
    public Object apply(Object obj) {
        return Long.valueOf(((EncoderImpl) this.a).toPresentationTimeUsByCaptureEncodeRatio(((Long) obj).longValue()));
    }

    @Override // androidx.camera.video.internal.encoder.e0
    public MediaFormat getMediaFormat() {
        return EncoderImpl.e.lambda$onOutputFormatChanged$5((MediaFormat) this.a);
    }
}
