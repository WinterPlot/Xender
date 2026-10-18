package com.userlabs.xshare.vdlist;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                k.lambda$updateDb$9(list);
                break;
            case 1:
                k.lambda$newVideo$4(list);
                break;
            case 2:
                k.lambda$getConfigAndSave$1(list);
                break;
            default:
                k.searchLocalAndUpdateDb(list);
                break;
        }
    }
}
