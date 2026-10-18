package androidx.emoji2.text;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a implements d {
        private final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.d
        public long getPosition() {
            return this.a.position();
        }

        @Override // androidx.emoji2.text.l.d
        public int readTag() throws IOException {
            return this.a.getInt();
        }

        @Override // androidx.emoji2.text.l.d
        public long readUnsignedInt() throws IOException {
            return l.toUnsignedInt(this.a.getInt());
        }

        @Override // androidx.emoji2.text.l.d
        public int readUnsignedShort() throws IOException {
            return l.toUnsignedShort(this.a.getShort());
        }

        @Override // androidx.emoji2.text.l.d
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b implements d {
        private final byte[] a;
        private final ByteBuffer b;
        private final InputStream c;
        private long d = 0;

        public b(InputStream inputStream) {
            this.c = inputStream;
            byte[] bArr = new byte[4];
            this.a = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.b = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void read(int i) throws IOException {
            if (this.c.read(this.a, 0, i) == i) {
                this.d += (long) i;
            } else {
                b0.t("read failed");
            }
        }

        @Override // androidx.emoji2.text.l.d
        public long getPosition() {
            return this.d;
        }

        @Override // androidx.emoji2.text.l.d
        public int readTag() throws IOException {
            this.b.position(0);
            read(4);
            return this.b.getInt();
        }

        @Override // androidx.emoji2.text.l.d
        public long readUnsignedInt() throws IOException {
            this.b.position(0);
            read(4);
            return l.toUnsignedInt(this.b.getInt());
        }

        @Override // androidx.emoji2.text.l.d
        public int readUnsignedShort() throws IOException {
            this.b.position(0);
            read(2);
            return l.toUnsignedShort(this.b.getShort());
        }

        @Override // androidx.emoji2.text.l.d
        public void skip(int i) throws IOException {
            while (i > 0) {
                int iSkip = (int) this.c.skip(i);
                if (iSkip < 1) {
                    b0.t("Skip didn't move at least 1 byte forward");
                    return;
                } else {
                    i -= iSkip;
                    this.d += (long) iSkip;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private final long a;
        private final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long getLength() {
            return this.b;
        }

        public long getStartOffset() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface d {
        long getPosition();

        int readTag() throws IOException;

        long readUnsignedInt() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int i) throws IOException;
    }

    private l() {
    }

    private static c findOffsetInfo(d dVar) throws IOException {
        long unsignedInt;
        dVar.skip(4);
        int unsignedShort = dVar.readUnsignedShort();
        if (unsignedShort > 100) {
            b0.t("Cannot read metadata.");
            return null;
        }
        dVar.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int tag = dVar.readTag();
            dVar.skip(4);
            unsignedInt = dVar.readUnsignedInt();
            dVar.skip(4);
            if (1835365473 == tag) {
                break;
            }
            i++;
        }
        if (unsignedInt != -1) {
            dVar.skip((int) (unsignedInt - dVar.getPosition()));
            dVar.skip(12);
            long unsignedInt2 = dVar.readUnsignedInt();
            for (int i2 = 0; i2 < unsignedInt2; i2++) {
                int tag2 = dVar.readTag();
                long unsignedInt3 = dVar.readUnsignedInt();
                long unsignedInt4 = dVar.readUnsignedInt();
                if (1164798569 == tag2 || 1701669481 == tag2) {
                    return new c(unsignedInt3 + unsignedInt, unsignedInt4);
                }
            }
        }
        b0.t("Cannot read metadata.");
        return null;
    }

    public static androidx.emoji2.text.flatbuffer.f read(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c cVarFindOffsetInfo = findOffsetInfo(bVar);
        bVar.skip((int) (cVarFindOffsetInfo.getStartOffset() - bVar.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) cVarFindOffsetInfo.getLength());
        int i = inputStream.read(byteBufferAllocate.array());
        if (i == cVarFindOffsetInfo.getLength()) {
            return androidx.emoji2.text.flatbuffer.f.getRootAsMetadataList(byteBufferAllocate);
        }
        throw new IOException("Needed " + cVarFindOffsetInfo.getLength() + " bytes, got " + i);
    }

    public static long toUnsignedInt(int i) {
        return ((long) i) & 4294967295L;
    }

    public static int toUnsignedShort(short s) {
        return s & 65535;
    }

    public static androidx.emoji2.text.flatbuffer.f read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) findOffsetInfo(new a(byteBufferDuplicate)).getStartOffset());
        return androidx.emoji2.text.flatbuffer.f.getRootAsMetadataList(byteBufferDuplicate);
    }

    public static androidx.emoji2.text.flatbuffer.f read(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.f fVar = read(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return fVar;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
