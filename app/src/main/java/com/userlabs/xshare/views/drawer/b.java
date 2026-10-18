package com.userlabs.xshare.views.drawer;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerView b;

    public /* synthetic */ b(DrawerView drawerView, int i) {
        this.a = i;
        this.b = drawerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        DrawerView drawerView = this.b;
        switch (i) {
            case 0:
                drawerView.lambda$initSettingsLayout$7(view);
                break;
            case 1:
                drawerView.lambda$initMe$2(view);
                break;
            case 2:
                drawerView.lambda$addAboutLayout$6(view);
                break;
            case 3:
                drawerView.lambda$addLanguageLayout$9(view);
                break;
            case 4:
                drawerView.lambda$addRateLayer$14(view);
                break;
            case 5:
                drawerView.lambda$addXiaomiArea$11(view);
                break;
            case 6:
                drawerView.lambda$addOrRemoveObbLayer$12(view);
                break;
            default:
                drawerView.lambda$initHelpLayout$3(view);
                break;
        }
    }
}
