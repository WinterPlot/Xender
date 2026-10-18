package androidx.camera.video.internal.muxer;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ByteBuffer c;
    public final /* synthetic */ MediaCodec.BufferInfo d;
    public final /* synthetic */ d e;

    public /* synthetic */ a(d dVar, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2) {
        this.a = i2;
        this.e = dVar;
        this.b = i;
        this.c = byteBuffer;
        this.d = bufferInfo;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        MediaCodec.BufferInfo bufferInfo = this.d;
        ByteBuffer byteBuffer = this.c;
        int i2 = this.b;
        d dVar = this.e;
        switch (i) {
            case 0:
                return Media3MuxerImpl.writeSampleData$lambda$1((Media3MuxerImpl) dVar, i2, byteBuffer, bufferInfo);
            default:
                return MediaMuxerImpl.writeSampleData$lambda$1((MediaMuxerImpl) dVar, i2, byteBuffer, bufferInfo);
        }
    }
}
