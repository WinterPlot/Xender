package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ l(int i, long j, int i2) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return n.lambda$loadCanRepeatLimitSync$10(this.b, this.c, (androidx.sqlite.b) obj);
            case 1:
                return n.lambda$loadCanRepeatLimit$9(this.b, this.c, (androidx.sqlite.b) obj);
            case 2:
                return m1.lambda$getReceivedPagedListAfterStartId$26(this.c, this.b, (androidx.sqlite.b) obj);
            case 3:
                return m1.lambda$getDistanceId$25(this.c, this.b, (androidx.sqlite.b) obj);
            case 4:
                return m1.lambda$getReceivedPagedListBeforeStartId$27(this.c, this.b, (androidx.sqlite.b) obj);
            case 5:
                return com.userlabs.xshare.xad.dbdao.c.lambda$loadAllDataBySceneSync$2(this.c, this.b, (androidx.sqlite.b) obj);
            default:
                return com.userlabs.xshare.xad.dbdao.c.lambda$loadAllDataBySceneAsync$3(this.c, this.b, (androidx.sqlite.b) obj);
        }
    }

    public /* synthetic */ l(long j, int i, int i2) {
        this.a = i2;
        this.c = j;
        this.b = i;
    }
}
