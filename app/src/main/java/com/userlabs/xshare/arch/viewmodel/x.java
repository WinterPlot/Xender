package com.userlabs.xshare.arch.viewmodel;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseFileViewModel b;
    public final /* synthetic */ com.userlabs.xshare.arch.vo.a c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ x(BaseFileViewModel baseFileViewModel, com.userlabs.xshare.arch.vo.a aVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = baseFileViewModel;
        this.c = aVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ArrayList arrayList = this.d;
        com.userlabs.xshare.arch.vo.a aVar = this.c;
        BaseFileViewModel baseFileViewModel = this.b;
        switch (i) {
            case 0:
                baseFileViewModel.lambda$doDeleteSelected$1(aVar, arrayList);
                break;
            default:
                baseFileViewModel.lambda$doItemCheckedChangeByPosition$4(aVar, arrayList);
                break;
        }
    }
}
