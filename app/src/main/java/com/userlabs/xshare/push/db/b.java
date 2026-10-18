package com.userlabs.xshare.push.db;

import java.util.List;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ List c;

    public /* synthetic */ b(c cVar, List list, int i) {
        this.a = i;
        this.b = cVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        c cVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return cVar.lambda$deleteAndClearExpired$3(list, bVar);
            case 1:
                return cVar.lambda$delete$1(list, bVar);
            case 2:
                return cVar.lambda$insertAll$0(list, bVar);
            default:
                return cVar.lambda$update$2(list, bVar);
        }
    }
}
