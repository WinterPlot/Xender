package com.userlabs.xshare.ui.fragment.res;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseContainResBarLayoutFragment b;

    public /* synthetic */ e(BaseContainResBarLayoutFragment baseContainResBarLayoutFragment, int i) {
        this.a = i;
        this.b = baseContainResBarLayoutFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BaseContainResBarLayoutFragment baseContainResBarLayoutFragment = this.b;
        switch (i) {
            case 0:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$0(view);
                break;
            case 1:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$1(view);
                break;
            case 2:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$2(view);
                break;
            case 3:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$4(view);
                break;
            case 4:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayoutWithOptions$5(view);
                break;
            case 5:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayout$6(view);
                break;
            case 6:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayout$7(view);
                break;
            default:
                baseContainResBarLayoutFragment.lambda$addResStatusBarLayout$9(view);
                break;
        }
    }
}
