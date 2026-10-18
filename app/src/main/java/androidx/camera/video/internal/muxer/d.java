package androidx.camera.video.internal.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    int addTrack(MediaFormat mediaFormat) throws MuxerException;

    boolean isInterruptionResilient();

    void release();

    void setCaptureFps(int i) throws IllegalArgumentException;

    void setLocation(double d, double d2) throws IllegalArgumentException;

    void setOrientationDegrees(int i) throws IllegalArgumentException;

    void setOutput(ParcelFileDescriptor parcelFileDescriptor, int i) throws IOException;

    void setOutput(String str, int i) throws IOException;

    void start() throws MuxerException;

    void stop() throws MuxerException;

    void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws MuxerException;
}
