package com.userlabs.xshare.m3u8;

import android.media.MediaDataSource;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import okhttp3.b0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends MediaDataSource {
    private final File[] a;
    private final long[] b;
    private final long c;
    private RandomAccessFile d;
    private int e = -1;

    public b(List<File> list) throws IOException {
        if (list == null || list.isEmpty()) {
            b0.t("segment list is empty");
            throw null;
        }
        int size = list.size();
        int i = 0;
        this.a = (File[]) list.toArray(new File[0]);
        this.b = new long[size + 1];
        long j = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= size) {
                jArr[size] = j;
                this.c = j;
                return;
            }
            jArr[i] = j;
            long length = this.a[i].length();
            if (length <= 0) {
                j0.h("empty or missing segment: ", this.a[i]);
                throw null;
            }
            j += length;
            i++;
        }
    }

    private void closeCached() {
        RandomAccessFile randomAccessFile = this.d;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
            this.d = null;
            this.e = -1;
        }
    }

    private int indexOf(long j) {
        int length = this.a.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = ((i + length) + 1) >>> 1;
            if (this.b[i2] <= j) {
                i = i2;
            } else {
                length = i2 - 1;
            }
        }
        return i;
    }

    private RandomAccessFile open(int i) throws IOException {
        RandomAccessFile randomAccessFile;
        if (this.e == i && (randomAccessFile = this.d) != null) {
            return randomAccessFile;
        }
        closeCached();
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.a[i], "r");
        this.d = randomAccessFile2;
        this.e = i;
        return randomAccessFile2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeCached();
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.c;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (j >= 0 && j < this.c) {
            int i3 = 0;
            if (i2 <= 0) {
                return 0;
            }
            long j2 = j;
            while (i3 < i2 && j2 < this.c) {
                int iIndexOf = indexOf(j2);
                RandomAccessFile randomAccessFileOpen = open(iIndexOf);
                long[] jArr = this.b;
                long j3 = j2 - jArr[iIndexOf];
                int iMin = (int) Math.min(i2 - i3, jArr[iIndexOf + 1] - j2);
                randomAccessFileOpen.seek(j3);
                int i4 = randomAccessFileOpen.read(bArr, i + i3, iMin);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
                j2 += (long) i4;
            }
            if (i3 > 0) {
                return i3;
            }
        }
        return -1;
    }
}
