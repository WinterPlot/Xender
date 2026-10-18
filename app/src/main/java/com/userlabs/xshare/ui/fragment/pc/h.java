package com.userlabs.xshare.ui.fragment.pc;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((PcConnectMainFragment.a) obj).lambda$onCreate$0(view);
                break;
            case 1:
                ((PcConnectMainFragment) obj).lambda$intiToolBar$1(view);
                break;
            default:
                ((PcNetworkFragment) obj).lambda$onViewCreated$0(view);
                break;
        }
    }
}
