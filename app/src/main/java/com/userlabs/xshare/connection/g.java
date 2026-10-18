package com.userlabs.xshare.connection;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateFragment b;

    public /* synthetic */ g(CreateFragment createFragment, int i) {
        this.a = i;
        this.b = createFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CreateFragment createFragment = this.b;
        switch (i) {
            case 0:
                createFragment.lambda$addHighSpeedLayoutIfSupport$30(view);
                break;
            case 1:
                createFragment.lambda$showChangeReceiveTips$32(view);
                break;
            case 2:
                createFragment.lambda$createSuccess$16(view);
                break;
            case 3:
                createFragment.lambda$showBigQRCodeDialog$23(view);
                break;
            case 4:
                createFragment.lambda$initToolbar$1(view);
                break;
            case 5:
                createFragment.lambda$createFailed$22(view);
                break;
            default:
                createFragment.lambda$showHighSpeedHelperDialog$25(view);
                break;
        }
    }
}
