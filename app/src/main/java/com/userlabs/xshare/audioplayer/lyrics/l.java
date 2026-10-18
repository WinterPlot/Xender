package com.userlabs.xshare.audioplayer.lyrics;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements g {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public /* synthetic */ l(g gVar, String str, String str2, long j, int i) {
        this.a = i;
        this.b = gVar;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // com.userlabs.xshare.audioplayer.lyrics.g
    public final void onResult(p pVar) {
        switch (this.a) {
            case 0:
                n.lambda$loadFromDiskOrSearchAndSaveLyricsIfNeed$0(this.b, this.c, this.d, this.e, pVar);
                break;
            default:
                n.lambda$loadFromDiskOrSearchAndSaveLyricsIfNeed$1(this.b, this.c, this.d, this.e, pVar);
                break;
        }
    }
}
