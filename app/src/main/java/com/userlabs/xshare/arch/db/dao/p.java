package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ List c;

    public /* synthetic */ p(s sVar, List list, int i) {
        this.a = i;
        this.b = sVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        s sVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return sVar.lambda$insertAll$0(list, bVar);
            default:
                return sVar.lambda$updateApps$1(list, bVar);
        }
    }
}
