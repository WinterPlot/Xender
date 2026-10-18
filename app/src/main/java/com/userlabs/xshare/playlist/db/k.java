package com.userlabs.xshare.playlist.db;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m b;
    public final /* synthetic */ List c;
    public final /* synthetic */ m.b d;
    public final /* synthetic */ long e;
    public final /* synthetic */ m.a f;

    public /* synthetic */ k(m mVar, long j, List list, m.a aVar, m.b bVar) {
        this.b = mVar;
        this.e = j;
        this.c = list;
        this.f = aVar;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$addSongsToPlaylist$5(this.e, this.c, this.f, this.d);
                break;
            default:
                this.b.lambda$insertAll$11(this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ k(m mVar, List list, m.b bVar, long j, m.a aVar) {
        this.b = mVar;
        this.c = list;
        this.d = bVar;
        this.e = j;
        this.f = aVar;
    }
}
