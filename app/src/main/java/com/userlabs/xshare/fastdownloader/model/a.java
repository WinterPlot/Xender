package com.userlabs.xshare.fastdownloader.model;

import com.userlabs.xshare.fastdownloader.model.exceptions.CheckChunkException;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private long e;
    private long f;
    private long g;

    public a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    public synchronized long getCurrentByteIndex() {
        return this.g;
    }

    public synchronized long getCurrentSize() {
        return (this.g - this.e) + 1;
    }

    public String getDownloadLocation() {
        return this.b;
    }

    public synchronized long getEndByteIndex() {
        return this.f;
    }

    public File getFile() {
        return new File(this.b, this.d);
    }

    public String getFileName() {
        return this.d;
    }

    public String getId() {
        return this.c;
    }

    public String getParentTaskId() {
        return this.a;
    }

    public synchronized long getSize() {
        return (this.f - this.e) + 1;
    }

    public synchronized long getStartByteIndex() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public synchronized boolean isComplete() throws CheckChunkException {
        boolean z;
        synchronized (this) {
            try {
                if (this.g >= this.f) {
                    File file = getFile();
                    if (!file.exists() || !file.isFile()) {
                        this.g = this.e - 1;
                        throw new CheckChunkException();
                    }
                    if (this.g == this.f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
        return z;
    }

    public synchronized boolean isCompleteCaught() {
        boolean zIsComplete;
        synchronized (this) {
            try {
                zIsComplete = isComplete();
            } catch (CheckChunkException unused) {
                return false;
            }
        }
        return zIsComplete;
        return zIsComplete;
    }

    public synchronized void setCurrentByteIndex(long j) {
        this.g = j;
    }

    public synchronized void setEndByteIndex(long j) {
        this.f = j;
    }

    public synchronized void setStartByteIndex(long j) {
        this.e = j;
    }

    public synchronized String toString() {
        return "( " + this.e + " - " + this.g + " - " + this.f + " )";
    }

    public a(String str, String str2, String str3, String str4, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = j - 1;
    }
}
