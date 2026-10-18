package com.userlabs.xshare.social.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SocialChildBaseFragment b;

    public /* synthetic */ b(SocialChildBaseFragment socialChildBaseFragment, int i) {
        this.a = i;
        this.b = socialChildBaseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SocialChildBaseFragment socialChildBaseFragment = this.b;
        switch (i) {
            case 0:
                socialChildBaseFragment.lambda$installToolbar$2(view);
                break;
            default:
                socialChildBaseFragment.lambda$onViewCreated$0(view);
                break;
        }
    }
}
