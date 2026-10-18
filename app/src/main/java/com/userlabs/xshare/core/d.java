package com.userlabs.xshare.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends PushbackInputStream {
    public d(InputStream inputStream) {
        super(inputStream);
    }

    public static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private IOException streamClosed() throws IOException {
        throw new IOException("PushbackInputStream is closed");
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int length;
        if (((PushbackInputStream) this).buf == null) {
            throw streamClosed();
        }
        checkOffsetAndCount(bArr.length, i, i2);
        int i3 = ((PushbackInputStream) this).pos;
        byte[] bArr2 = ((PushbackInputStream) this).buf;
        if (i3 < bArr2.length) {
            length = bArr2.length - i3 >= i2 ? i2 : bArr2.length - i3;
            System.arraycopy(bArr2, i3, bArr, i, length);
            i += length;
            ((PushbackInputStream) this).pos += length;
        } else {
            length = 0;
        }
        if (length <= 0) {
            int i4 = ((PushbackInputStream) this).in.read(bArr, i, i2 - length);
            if (i4 > 0) {
                return i4 + length;
            }
            if (length == 0) {
                return i4;
            }
        }
        return length;
    }

    public d(InputStream inputStream, int i) {
        super(inputStream, i);
    }
}
