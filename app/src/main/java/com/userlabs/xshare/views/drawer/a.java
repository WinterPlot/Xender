package com.userlabs.xshare.views.drawer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerView b;

    public /* synthetic */ a(DrawerView drawerView, int i) {
        this.a = i;
        this.b = drawerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrawerView drawerView = this.b;
        switch (i) {
            case 0:
                drawerView.lambda$addXiaomiArea$10();
                break;
            default:
                drawerView.lambda$addLanguageLayout$8();
                break;
        }
    }
}
