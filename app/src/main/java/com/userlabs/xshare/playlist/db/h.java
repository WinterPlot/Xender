package com.userlabs.xshare.playlist.db;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ List c;

    public /* synthetic */ h(j jVar, List list, int i) {
        this.a = i;
        this.b = jVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        j jVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return jVar.lambda$update$2(list, bVar);
            default:
                return jVar.lambda$insertAll$0(list, bVar);
        }
    }
}
