package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    MediaCodec.BufferInfo getBufferInfo();

    ByteBuffer getByteBuffer();

    ListenableFuture<Void> getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
