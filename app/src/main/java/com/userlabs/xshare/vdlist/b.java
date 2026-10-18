package com.userlabs.xshare.vdlist;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ List c;

    public /* synthetic */ b(d dVar, List list, int i) {
        this.a = i;
        this.b = dVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        d dVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return dVar.lambda$updatePart$0(list, bVar);
            case 1:
                return dVar.lambda$insert$2(list, bVar);
            default:
                return dVar.lambda$coverEntityList$1(list, bVar);
        }
    }
}
