package com.userlabs.xshare.arch.db.dao;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ b0(s0 s0Var, List list, int i) {
        this.a = i;
        this.b = s0Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        s0 s0Var = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return s0Var.lambda$deleteAudio$2(list, bVar);
            case 1:
                return s0Var.lambda$updateAudioList$3(list, bVar);
            case 2:
                return s0Var.lambda$insertAllFts$1(list, bVar);
            case 3:
                return s0Var.lambda$updateFts$4(list, bVar);
            default:
                return s0Var.lambda$insertAll$0(list, bVar);
        }
    }
}
