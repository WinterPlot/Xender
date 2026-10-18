package com.userlabs.xshare.social.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StatusSaverFragment b;

    public /* synthetic */ h(StatusSaverFragment statusSaverFragment, int i) {
        this.a = i;
        this.b = statusSaverFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        StatusSaverFragment statusSaverFragment = this.b;
        switch (i) {
            case 0:
                statusSaverFragment.lambda$installToolbar$2(view);
                break;
            default:
                statusSaverFragment.lambda$onViewCreated$1(view);
                break;
        }
    }
}
