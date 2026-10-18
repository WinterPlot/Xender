package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends FilterInputStream {
    private final long a;
    private int b;

    private c(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private int checkReadSoFarOrThrow(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
            return i;
        }
        if (this.a - ((long) this.b) <= 0) {
            return i;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.a + ", but read: " + this.b);
    }

    public static InputStream obtain(InputStream inputStream, String str) {
        return obtain(inputStream, parseContentLength(str));
    }

    private static int parseContentLength(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            if (!Log.isLoggable("ContentLengthStream", 3)) {
                return -1;
            }
            Log.d("ContentLengthStream", "failed to parse content length header: " + str, e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.a - ((long) this.b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        checkReadSoFarOrThrow(i >= 0 ? 1 : -1);
        return i;
    }

    public static InputStream obtain(InputStream inputStream, long j) {
        return new c(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return checkReadSoFarOrThrow(super.read(bArr, i, i2));
    }
}
