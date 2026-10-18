package com.userlabs.xshare.videoplayer.db;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ i c;

    public /* synthetic */ d(h hVar, i iVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = iVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        i iVar = this.c;
        h hVar = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return hVar.lambda$update$2(iVar, bVar);
            default:
                return hVar.lambda$insert$1(iVar, bVar);
        }
    }
}
