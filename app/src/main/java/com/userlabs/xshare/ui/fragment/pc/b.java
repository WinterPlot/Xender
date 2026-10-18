package com.userlabs.xshare.ui.fragment.pc;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PcConnectFragment b;

    public /* synthetic */ b(PcConnectFragment pcConnectFragment, int i) {
        this.a = i;
        this.b = pcConnectFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PcConnectFragment pcConnectFragment = this.b;
        switch (i) {
            case 0:
                pcConnectFragment.lambda$showVideoTips$9(view);
                break;
            case 1:
                pcConnectFragment.lambda$showOpenHotspotDialog$10(view);
                break;
            case 2:
                pcConnectFragment.lambda$onViewCreated$0(view);
                break;
            case 3:
                pcConnectFragment.lambda$onViewCreated$1(view);
                break;
            case 4:
                pcConnectFragment.lambda$onViewCreated$2(view);
                break;
            case 5:
                pcConnectFragment.lambda$onViewCreated$3(view);
                break;
            case 6:
                pcConnectFragment.lambda$onViewCreated$4(view);
                break;
            default:
                pcConnectFragment.lambda$onViewCreated$5(view);
                break;
        }
    }
}
