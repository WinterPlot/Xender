package com.userlabs.xshare.arch.viewmodel;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ u0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                TransferFragmentViewModel.lambda$startNeedRangeTasks$11(list);
                break;
            default:
                com.userlabs.xshare.send.e.sendFiles(list, true);
                break;
        }
    }
}
