package com.userlabs.xshare.ui.fragment;

import android.view.MenuItem;
import android.view.View;
import com.google.android.material.overflow.OverflowLinearLayout;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((XShareMainFragment) obj2).lambda$setupMenuGuide$32((com.userlabs.xshare.menuguide.b) obj, menuItem);
            default:
                return OverflowLinearLayout.lambda$handleOverflowButtonClick$1((View) obj2, (MenuItem) obj, menuItem);
        }
    }
}
