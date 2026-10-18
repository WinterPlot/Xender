package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class g extends e {
    public int e;
    public ByteBuffer f;
    public int g;
    public int h;
    public ByteBuffer[] i;
    public int[] j;
    public int k;
    public int l;
    public int m;
    public ByteBuffer p;
    private final e.a<g> v;

    public g(e.a<g> aVar) {
        this.v = aVar;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        return i2 <= 0 || i < Integer.MAX_VALUE / i2;
    }

    public void init(long j, int i, ByteBuffer byteBuffer) {
        this.b = j;
        this.e = i;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.p = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.p;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.p = ByteBuffer.allocate(iLimit);
        } else {
            this.p.clear();
        }
        this.p.put(byteBuffer);
        this.p.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ByteBuffer[] byteBufferArr = this.i;
        if (byteBufferArr == null) {
            byteBufferArr = new ByteBuffer[3];
            this.i = byteBufferArr;
        }
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null) {
            return false;
        }
        this.g = i2;
        this.h = i3;
        this.k = i6;
        int i8 = i4 * i3;
        int i9 = (i3 >> 1) * i5;
        int i10 = i4 * i7;
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i8);
        byteBuffer.position(i10 + i);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i9);
        byteBuffer.position(i10 + ((i7 >> 1) * i5) + i);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i9);
        int[] iArr = this.j;
        if (iArr == null) {
            iArr = new int[3];
            this.j = iArr;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i5;
        return true;
    }

    public void initForPrivateFrame(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.g = i;
        this.h = i2;
        this.k = i5;
        this.l = i3;
        this.m = i4;
        int i6 = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 * 2) + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.f;
                if (byteBuffer == null || byteBuffer.capacity() < i9) {
                    this.f = ByteBuffer.allocateDirect(i9);
                } else {
                    this.f.position(0);
                    this.f.limit(i9);
                }
                ByteBuffer[] byteBufferArr = this.i;
                if (byteBufferArr == null) {
                    byteBufferArr = new ByteBuffer[3];
                    this.i = byteBufferArr;
                }
                ByteBuffer byteBuffer2 = this.f;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i7);
                byteBuffer2.position(i7);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i8);
                byteBuffer2.position(i7 + i8);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i8);
                int[] iArr = this.j;
                if (iArr == null) {
                    iArr = new int[3];
                    this.j = iArr;
                }
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.decoder.e
    public void release() {
        ((androidx.media3.extractor.text.cea.d) this.v).releaseOutputBuffer(this);
    }
}
