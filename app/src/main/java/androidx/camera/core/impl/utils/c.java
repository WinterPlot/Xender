package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class c extends FilterOutputStream {
    final OutputStream a;
    private ByteOrder b;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.a = outputStream;
        this.b = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    public void writeByte(int i) throws IOException {
        this.a.write(i);
    }

    public void writeInt(int i) throws IOException {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.a.write(i & 255);
            this.a.write((i >>> 8) & 255);
            this.a.write((i >>> 16) & 255);
            this.a.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.a.write((i >>> 24) & 255);
            this.a.write((i >>> 16) & 255);
            this.a.write((i >>> 8) & 255);
            this.a.write(i & 255);
        }
    }

    public void writeShort(short s) throws IOException {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.a.write(s & 255);
            this.a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.a.write((s >>> 8) & 255);
            this.a.write(s & 255);
        }
    }

    public void writeUnsignedInt(long j) throws IOException {
        writeInt((int) j);
    }

    public void writeUnsignedShort(int i) throws IOException {
        writeShort((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
