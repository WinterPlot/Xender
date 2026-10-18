package com.userlabs.xshare.playlist.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ long c;

    public /* synthetic */ l(m mVar, long j, int i) {
        this.a = i;
        this.b = mVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.lambda$removeSongFromFavourites$4(j);
                break;
            default:
                mVar.lambda$deletePlaylist$7(j);
                break;
        }
    }
}
