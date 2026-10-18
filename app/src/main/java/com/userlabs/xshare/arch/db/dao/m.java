package com.userlabs.xshare.arch.db.dao;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Set c;

    public /* synthetic */ m(String str, int i, Set set) {
        this.a = i;
        this.b = str;
        this.c = set;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        Set set = this.c;
        String str = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return n.lambda$loadDataListByIdsSync$39(str, set, bVar);
            case 1:
                return s0.lambda$loadDataListByIdsSync$39(str, set, bVar);
            case 2:
                return f1.lambda$loadDataListByIdsSync$13(str, set, bVar);
            default:
                return m2.lambda$loadDataListByIdsSync$18(str, set, bVar);
        }
    }
}
