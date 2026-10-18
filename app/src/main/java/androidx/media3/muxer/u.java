package androidx.media3.muxer;

import androidx.media3.common.b0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class u {
    public final int a;
    public final androidx.media3.common.t b;
    public final int c;
    public final List<f> d;
    public final List<Long> e;
    public final List<Integer> f;
    public final Deque<f> g;
    public final Deque<ByteBuffer> h;
    public boolean i;
    public byte[] j;
    public long k;
    private final boolean l;

    public u(int i, androidx.media3.common.t tVar, int i2, boolean z) {
        this.a = i;
        this.b = tVar;
        this.c = i2;
        this.l = z;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        this.k = -9223372036854775807L;
    }

    public int videoUnitTimebase() {
        if (b0.isAudio(this.b.p)) {
            return this.b.I;
        }
        return 90000;
    }

    public void writeSampleData(ByteBuffer byteBuffer, f fVar) {
        com.google.common.base.m.checkArgument(this.k == -9223372036854775807L, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
        if (fVar.b == 0 || byteBuffer.remaining() == 0) {
            if ((fVar.c & 4) != 0) {
                this.k = fVar.a;
                return;
            }
            return;
        }
        if ((fVar.c & 1) > 0) {
            this.i = true;
        }
        if (this.i || !b0.isVideo(this.b.p)) {
            if (this.l) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer);
                byteBufferAllocateDirect.rewind();
                byteBuffer = byteBufferAllocateDirect;
            }
            this.g.addLast(new f(fVar.a, byteBuffer.remaining(), fVar.c));
            this.h.addLast(byteBuffer);
        }
    }

    public u(int i, androidx.media3.common.t tVar, boolean z) {
        this(i, tVar, 1, z);
    }
}
