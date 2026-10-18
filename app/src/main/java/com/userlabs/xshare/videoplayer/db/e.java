package com.userlabs.xshare.videoplayer.db;

import java.util.List;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ List c;

    public /* synthetic */ e(h hVar, List list, int i) {
        this.a = i;
        this.b = hVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        h hVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return hVar.lambda$update$3(list, bVar);
            default:
                return hVar.lambda$insert$0(list, bVar);
        }
    }
}
