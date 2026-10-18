package com.userlabs.xshare.connection;

import android.view.MenuItem;
import android.widget.Button;
import com.userlabs.xshare.social.fragment.StatusSaverFragment;
import com.userlabs.xshare.social.fragment.XSocialMainFragment;
import com.google.android.material.button.MaterialButtonGroup;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((CreateFragment) obj).lambda$initToolbar$0(menuItem);
            case 1:
                return ((StatusSaverFragment) obj).lambda$setupHelp$3(menuItem);
            case 2:
                return ((XSocialMainFragment) obj).lambda$setupHelp$12(menuItem);
            case 3:
                return ((com.userlabs.xshare.upgrade.h) obj).lambda$new$1(menuItem);
            default:
                return MaterialButtonGroup.lambda$addMenuItemForButton$2((Button) obj, menuItem);
        }
    }
}
