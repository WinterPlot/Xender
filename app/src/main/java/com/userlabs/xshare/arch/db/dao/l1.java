package com.userlabs.xshare.arch.db.dao;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ l1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (this.a) {
            case 0:
                return m1.lambda$loadNewTopDataSync$4(bVar);
            case 1:
                return m1.lambda$loadReceivedCount$15(bVar);
            case 2:
                return o1.lambda$loadAll$3(bVar);
            case 3:
                return r1.lambda$loadAllSync$2(bVar);
            case 4:
                return r1.lambda$deleteAll$3(bVar);
            case 5:
                return z1.lambda$loadMaxIdSync$3(bVar);
            case 6:
                return z1.lambda$clear$22(bVar);
            case 7:
                return z1.lambda$loadAllIdsSync$19(bVar);
            case 8:
                return d2.lambda$loadAll$2(bVar);
            case 9:
                return d2.lambda$loadCount$6(bVar);
            case 10:
                return d2.lambda$loadAllNoDeletedSync$7(bVar);
            case 11:
                return g2.lambda$loadAllSync$5(bVar);
            case 12:
                return g2.lambda$loadLastMessageReceiveTime$9(bVar);
            case 13:
                return g2.lambda$loadAll$6(bVar);
            case 14:
                return g2.lambda$loadUpgradeInfo$7(bVar);
            case 15:
                return g2.lambda$loadUpgradeInfoSync$8(bVar);
            case 16:
                return j2.lambda$loadAllPathSync$1(bVar);
            case 17:
                return j2.lambda$loadAllIdsSync$2(bVar);
            case 18:
                return m2.lambda$clear$24(bVar);
            case 19:
                return m2.lambda$loadAllIdsSync$3(bVar);
            case 20:
                return m2.lambda$loadMaxIdSync$6(bVar);
            case 21:
                return p2.lambda$loadAll$3(bVar);
            case 22:
                return p2.lambda$deleteAll$7(bVar);
            case 23:
                return p2.lambda$loadAllPkgsSync$5(bVar);
            case 24:
                return p2.lambda$loadAllSync$4(bVar);
            case 25:
                return com.userlabs.xshare.multiplatformconnection.db.c.lambda$clear$5(bVar);
            case 26:
                return com.userlabs.xshare.nlist.g.lambda$loadAllPnSyncOrderByIdAsc$3(bVar);
            case 27:
                return com.userlabs.xshare.nlist.g.lambda$deleteAll$4(bVar);
            case 28:
                return com.userlabs.xshare.nlist.g.lambda$loadAllSync$2(bVar);
            default:
                return com.userlabs.xshare.playlist.db.j.lambda$loadAllSync$5(bVar);
        }
    }
}
