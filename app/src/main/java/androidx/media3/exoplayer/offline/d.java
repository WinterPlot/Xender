package androidx.media3.exoplayer.offline;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    final k h;

    public d(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, k kVar) {
        com.google.common.base.m.checkNotNull(kVar);
        boolean z = false;
        com.google.common.base.m.checkArgument((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            com.google.common.base.m.checkArgument(z);
        }
        this.a = downloadRequest;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = kVar;
    }

    public long getBytesDownloaded() {
        return this.h.a;
    }

    public float getPercentDownloaded() {
        return this.h.b;
    }

    public boolean isTerminalState() {
        int i = this.b;
        return i == 3 || i == 4;
    }

    public d(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new k());
    }
}
