package com.userlabs.xshare.importdata;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExFirstFragment b;

    public /* synthetic */ b(ExFirstFragment exFirstFragment, int i) {
        this.a = i;
        this.b = exFirstFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        ExFirstFragment exFirstFragment = this.b;
        com.userlabs.xshare.arch.entry.b bVar = (com.userlabs.xshare.arch.entry.b) obj;
        switch (i) {
            case 0:
                exFirstFragment.lambda$onViewCreated$6(bVar);
                break;
            default:
                exFirstFragment.lambda$registerPreconditionResultListener$7(bVar);
                break;
        }
    }
}
