package com.userlabs.xshare.range;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ h c;

    public /* synthetic */ f(g gVar, h hVar, int i) {
        this.a = i;
        this.b = gVar;
        this.c = hVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        h hVar = this.c;
        g gVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return gVar.lambda$unionInsert$2(hVar, bVar);
            default:
                return gVar.lambda$insert$1(hVar, bVar);
        }
    }
}
