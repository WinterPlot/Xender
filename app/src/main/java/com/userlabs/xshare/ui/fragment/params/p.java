package com.userlabs.xshare.ui.fragment.params;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ParamsFragment b;

    public /* synthetic */ p(ParamsFragment paramsFragment, int i) {
        this.a = i;
        this.b = paramsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ParamsFragment paramsFragment = this.b;
        switch (i) {
            case 0:
                paramsFragment.lambda$onViewCreated$9(view);
                break;
            case 1:
                paramsFragment.lambda$showThresholdDlg$13(view);
                break;
            case 2:
                paramsFragment.lambda$onViewCreated$2(view);
                break;
            default:
                paramsFragment.lambda$onViewCreated$3(view);
                break;
        }
    }
}
