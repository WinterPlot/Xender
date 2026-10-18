package com.userlabs.xshare.basicservice;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends InputStream {
    private b a;
    private InputStream b;

    public c(InputStream inputStream) {
        this.a = new b();
        this.b = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b.read(bArr, i, i2);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            bArr[i5] = (byte) this.a.xor(bArr[i5]);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.b.skip(j);
    }

    public c(String str, InputStream inputStream) {
        this.a = new b(str);
        this.b = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i = this.b.read(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) this.a.xor(bArr[i2]);
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.a.xor(this.b.read());
    }
}
