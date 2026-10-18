package com.userlabs.xshare.social.fragment;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SocialChildBaseFragment b;

    public /* synthetic */ c(SocialChildBaseFragment socialChildBaseFragment, int i) {
        this.a = i;
        this.b = socialChildBaseFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        SocialChildBaseFragment socialChildBaseFragment = this.b;
        switch (i) {
            case 0:
                return socialChildBaseFragment.lambda$setupMenuTask$4(menuItem);
            default:
                return socialChildBaseFragment.lambda$setupHelp$3(menuItem);
        }
    }
}
