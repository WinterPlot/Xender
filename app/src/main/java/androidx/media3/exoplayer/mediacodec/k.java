package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public final n a;
        public final MediaFormat b;
        public final androidx.media3.common.t c;
        public final Surface d;
        public final MediaCrypto e;
        public final j f;

        private a(n nVar, MediaFormat mediaFormat, androidx.media3.common.t tVar, Surface surface, MediaCrypto mediaCrypto, j jVar) {
            this.a = nVar;
            this.b = mediaFormat;
            this.c = tVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = jVar;
        }

        public static a createForAudioDecoding(n nVar, MediaFormat mediaFormat, androidx.media3.common.t tVar, MediaCrypto mediaCrypto, j jVar) {
            return new a(nVar, mediaFormat, tVar, null, mediaCrypto, jVar);
        }

        public static a createForVideoDecoding(n nVar, MediaFormat mediaFormat, androidx.media3.common.t tVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, tVar, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {

        @Deprecated
        public static final b a = new i();

        k createAdapter(a aVar) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface d {
        void onFrameRendered(k kVar, long j, long j2);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void flush();

    ByteBuffer getInputBuffer(int i);

    PersistableBundle getMetrics();

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.c cVar, long j, int i3);

    boolean registerOnBufferAvailableListener(c cVar);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void setOnFrameRenderedListener(d dVar, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);

    void subscribeToVendorParameters(List<String> list);

    void unsubscribeFromVendorParameters(List<String> list);

    void useInputBuffer(Runnable runnable);
}
