package com.userlabs.xshare.disconnect;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DisconnectFragment b;

    public /* synthetic */ k(DisconnectFragment disconnectFragment, int i) {
        this.a = i;
        this.b = disconnectFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        DisconnectFragment disconnectFragment = this.b;
        com.userlabs.xshare.arch.entry.b bVar = (com.userlabs.xshare.arch.entry.b) obj;
        switch (i) {
            case 0:
                disconnectFragment.lambda$loadAd$3(bVar);
                break;
            default:
                disconnectFragment.lambda$onViewCreated$1(bVar);
                break;
        }
    }
}
