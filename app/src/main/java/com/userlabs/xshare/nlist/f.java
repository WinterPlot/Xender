package com.userlabs.xshare.nlist;

import java.util.List;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ List c;

    public /* synthetic */ f(g gVar, List list, int i) {
        this.a = i;
        this.b = gVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        g gVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return gVar.lambda$insertAll$0(list, bVar);
            default:
                return gVar.lambda$deleteAllAndInsertAll$1(list, bVar);
        }
    }
}
