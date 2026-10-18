package com.userlabs.xshare.push.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ b(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                d.sendEventInternal(list);
                break;
            case 1:
                d.lambda$deleteFromPushEventDb$1(list);
                break;
            case 2:
                d.lambda$updatePushEventStateToNormal$5(list);
                break;
            default:
                d.lambda$saveToPushEventDb$3(list);
                break;
        }
    }
}
