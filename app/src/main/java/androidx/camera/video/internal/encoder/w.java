package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(EncoderImpl.e eVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.a = 0;
        this.c = eVar;
        this.d = bufferInfo;
        this.e = mediaCodec;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((EncoderImpl.e) obj3).lambda$onOutputBufferAvailable$1((MediaCodec.BufferInfo) obj2, (MediaCodec) obj, i2);
                break;
            case 1:
                EncoderImpl.lambda$notifyError$11((k) obj3, i2, (String) obj2, (Throwable) obj);
                break;
            default:
                ((EncoderImpl) obj3).lambda$handleEncodeError$10(i2, (String) obj2, (Throwable) obj);
                break;
        }
    }

    public /* synthetic */ w(Object obj, int i, String str, Throwable th, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = str;
        this.e = th;
    }
}
