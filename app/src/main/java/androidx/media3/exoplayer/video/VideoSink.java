package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.s0;
import androidx.media3.common.util.e0;
import androidx.media3.common.util.k0;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class VideoSinkException extends Exception {
        public final androidx.media3.common.t format;

        public VideoSinkException(Throwable th, androidx.media3.common.t tVar) {
            super(th);
            this.format = tVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void render(long j);

        void skip();
    }

    void allowReleaseFirstFrameBeforeStarted();

    void clearOutputSurfaceInfo();

    void flush(boolean z);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, k0 k0Var);

    boolean handleInputFrame(long j, b bVar);

    boolean initialize(androidx.media3.common.t tVar) throws VideoSinkException;

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z);

    void join(boolean z);

    void onInputStreamChanged(int i, androidx.media3.common.t tVar, long j, int i2, List<androidx.media3.common.n> list);

    void redraw();

    void release();

    void render(long j, long j2) throws VideoSinkException;

    void setBufferTimestampAdjustmentUs(long j);

    void setChangeFrameRateStrategy(int i);

    void setListener(a aVar, Executor executor);

    void setOutputSurfaceInfo(Surface surface, e0 e0Var);

    void setPlaybackSpeed(float f);

    void setVideoEffects(List<androidx.media3.common.n> list);

    void setVideoFrameMetadataListener(o oVar);

    void signalEndOfCurrentInputStream();

    void signalEndOfInput();

    void startRendering();

    void stopRendering();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        public static final a a = new C0189a();

        void onError(VideoSinkException videoSinkException);

        void onFirstFrameRendered();

        void onFrameAvailableForRendering();

        void onFrameDropped();

        void onVideoSizeChanged(s0 s0Var);

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class C0189a implements a {
            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void onFirstFrameRendered() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void onFrameAvailableForRendering() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void onFrameDropped() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void onError(VideoSinkException videoSinkException) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void onVideoSizeChanged(s0 s0Var) {
            }
        }
    }
}
