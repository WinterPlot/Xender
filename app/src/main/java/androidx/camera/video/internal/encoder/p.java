package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        long j2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((EncoderImpl) obj).lambda$stop$4(j2, j);
                break;
            default:
                ((com.userlabs.xshare.playlist.db.m) obj).lambda$removeSongFromPlaylist$12(j2, j);
                break;
        }
    }
}
