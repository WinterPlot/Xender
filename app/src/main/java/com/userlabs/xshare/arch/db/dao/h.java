package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h(boolean z, long j) {
        this.a = 0;
        this.c = z;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return n.lambda$loadBigOnlyApks$38(this.c, this.b, (androidx.sqlite.b) obj);
            case 1:
                return s0.lambda$loadBigAudioCount$33(this.b, this.c, (androidx.sqlite.b) obj);
            case 2:
                return s0.lambda$loadBigAudios$32(this.b, this.c, (androidx.sqlite.b) obj);
            case 3:
                return m2.lambda$loadBigVideos$10(this.b, this.c, (androidx.sqlite.b) obj);
            default:
                return m2.lambda$loadBigVideoCount$11(this.b, this.c, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ h(long j, boolean z, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
    }
}
