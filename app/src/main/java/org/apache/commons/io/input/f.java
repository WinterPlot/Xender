package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class f extends InputStream {
    public static final f a;

    @Deprecated
    public static final f b;

    static {
        f fVar = new f();
        a = fVar;
        b = fVar;
    }

    public static InputStream ifNull(InputStream inputStream) {
        return inputStream != null ? inputStream : a;
    }

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return -1;
    }
}
