package com.userlabs.xshare.core.pc.client;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ List c;

    public /* synthetic */ b(g gVar, List list, int i) {
        this.a = i;
        this.b = gVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.lambda$deleteImage$15(list);
                break;
            case 1:
                gVar.lambda$deleteVideo$17(list);
                break;
            case 2:
                gVar.lambda$deleteMusic$16(list);
                break;
            default:
                gVar.lambda$deleteDocument$18(list);
                break;
        }
    }
}
