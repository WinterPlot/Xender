package com.userlabs.xshare.ui.fragment.videoai;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VAIAIFragment b;

    public /* synthetic */ a(VAIAIFragment vAIAIFragment, int i) {
        this.a = i;
        this.b = vAIAIFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        VAIAIFragment vAIAIFragment = this.b;
        switch (i) {
            case 0:
                vAIAIFragment.lambda$onViewCreated$1((com.userlabs.xshare.core.phone.event.a) obj);
                break;
            default:
                vAIAIFragment.lambda$registerConnectToWeb$2((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
