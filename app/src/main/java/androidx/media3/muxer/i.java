package androidx.media3.muxer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements t {
    private final FileOutputStream a;
    private final FileChannel b;

    public i(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
        this.b = fileOutputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // androidx.media3.muxer.t
    public long getPosition() throws IOException {
        return this.b.position();
    }

    @Override // androidx.media3.muxer.t
    public long getSize() throws IOException {
        return this.b.size();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.b.isOpen();
    }

    @Override // androidx.media3.muxer.t
    public void setPosition(long j) throws IOException {
        this.b.position(j);
    }

    @Override // androidx.media3.muxer.t
    public void truncate(long j) throws IOException {
        this.b.truncate(j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.b.write(byteBuffer);
    }
}
