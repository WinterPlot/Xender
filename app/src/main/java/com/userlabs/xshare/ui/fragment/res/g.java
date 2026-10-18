package com.userlabs.xshare.ui.fragment.res;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseContainResBarLayoutFragment b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ g(BaseContainResBarLayoutFragment baseContainResBarLayoutFragment, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = baseContainResBarLayoutFragment;
        this.c = z;
        this.d = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        BaseContainResBarLayoutFragment baseContainResBarLayoutFragment = this.b;
        switch (i) {
            case 0:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$3(z2, z, view);
                break;
            default:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayout$8(z2, z, view);
                break;
        }
    }
}
