package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ k(boolean z, long j, String str) {
        this.a = 0;
        this.c = z;
        this.b = j;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                long j = this.b;
                return n.lambda$searchBigOnlyApks$37(this.c, j, this.d, (androidx.sqlite.b) obj);
            case 1:
                return s0.lambda$searchBigAudio$38(this.b, this.c, this.d, (androidx.sqlite.b) obj);
            default:
                return m2.lambda$searchBigVideos$15(this.b, this.c, this.d, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ k(int i, long j, String str, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = str;
    }
}
