package com.userlabs.xshare.ui.fragment;

import android.view.MenuItem;
import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ XShareMainFragment b;
    public final /* synthetic */ MenuItem c;

    public /* synthetic */ p(XShareMainFragment xshareMainFragment, MenuItem menuItem, int i) {
        this.a = i;
        this.b = xshareMainFragment;
        this.c = menuItem;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        MenuItem menuItem = this.c;
        XShareMainFragment xshareMainFragment = this.b;
        switch (i) {
            case 0:
                xshareMainFragment.lambda$setupGameMenu$35(menuItem, (com.userlabs.xshare.arch.entry.b) obj);
                break;
            default:
                xshareMainFragment.lambda$setupMenuGuide$33(menuItem, (com.userlabs.xshare.menuguide.b) obj);
                break;
        }
    }
}
