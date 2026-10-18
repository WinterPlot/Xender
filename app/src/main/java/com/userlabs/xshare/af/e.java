package com.userlabs.xshare.af;

import java.util.List;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ List c;

    public /* synthetic */ e(f fVar, List list, int i) {
        this.a = i;
        this.b = fVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        f fVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return fVar.lambda$deleteAllAndInsertAll$1(list, bVar);
            default:
                return fVar.lambda$insertAll$0(list, bVar);
        }
    }
}
