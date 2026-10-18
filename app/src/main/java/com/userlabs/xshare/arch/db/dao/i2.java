package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ i2(int i, List list, String str) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        String str = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return j2.lambda$deleteByIds$4(str, list, bVar);
            case 1:
                return m2.lambda$loadDataByPath$7(str, list, bVar);
            case 2:
                return m2.lambda$deleteByIdList$23(str, list, bVar);
            case 3:
                return com.userlabs.xshare.multiplatformconnection.db.c.lambda$loadByKeyList$3(str, list, bVar);
            case 4:
                return com.userlabs.xshare.multiplatformconnection.db.g.lambda$deleteByDlKeyList$7(str, list, bVar);
            case 5:
                return com.userlabs.xshare.multiplatformconnection.db.n.lambda$deleteByDlKeyList$4(str, list, bVar);
            default:
                return com.userlabs.xshare.range.g.lambda$deleteByTaskIds$6(str, list, bVar);
        }
    }
}
