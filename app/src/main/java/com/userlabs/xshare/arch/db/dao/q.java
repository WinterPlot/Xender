package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ q(String str, int i, List list, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        List list = this.d;
        String str = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return s.lambda$updateNNet$10(str, i2, list, bVar);
            case 1:
                return m1.lambda$updateNNet$34(str, i2, list, bVar);
            case 2:
                return z1.lambda$deleteByPathList$20(str, list, i2, bVar);
            default:
                return m2.lambda$deleteByPathList$22(str, list, i2, bVar);
        }
    }

    public /* synthetic */ q(String str, List list, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = list;
        this.c = i;
    }
}
