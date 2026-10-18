package androidx.media3.muxer;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface t extends WritableByteChannel {
    long getPosition() throws IOException;

    long getSize() throws IOException;

    void setPosition(long j) throws IOException;

    void truncate(long j) throws IOException;
}
