package com.userlabs.xshare.ui.fragment.scanQRCode;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseCameraScanFragment b;

    public /* synthetic */ a(BaseCameraScanFragment baseCameraScanFragment, int i) {
        this.a = i;
        this.b = baseCameraScanFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BaseCameraScanFragment baseCameraScanFragment = this.b;
        switch (i) {
            case 0:
                baseCameraScanFragment.lambda$addBrokenTipsLayout$0(view);
                break;
            default:
                baseCameraScanFragment.lambda$showConnectSameWifiDialog$1(view);
                break;
        }
    }
}
