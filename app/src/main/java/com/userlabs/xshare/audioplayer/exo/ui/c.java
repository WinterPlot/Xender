package com.userlabs.xshare.audioplayer.exo.ui;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ XMPlayerFragment b;

    public /* synthetic */ c(XMPlayerFragment xMPlayerFragment, int i) {
        this.a = i;
        this.b = xMPlayerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        XMPlayerFragment xMPlayerFragment = this.b;
        switch (i) {
            case 0:
                xMPlayerFragment.lambda$addVolumeBoosterComponentIfNeed$21(view);
                break;
            case 1:
                xMPlayerFragment.lambda$addSleepTimeComponentIfNeed$17(view);
                break;
            case 2:
                xMPlayerFragment.lambda$setupView$5(view);
                break;
            case 3:
                xMPlayerFragment.lambda$addPlayBackSpeedComponentIfNeed$19(view);
                break;
            case 4:
                xMPlayerFragment.lambda$addPitchComponentIfNeed$20(view);
                break;
            case 5:
                xMPlayerFragment.lambda$setupView$6(view);
                break;
            case 6:
                xMPlayerFragment.lambda$setupView$7(view);
                break;
            case 7:
                xMPlayerFragment.lambda$setupView$8(view);
                break;
            case 8:
                xMPlayerFragment.lambda$setupView$9(view);
                break;
            case 9:
                xMPlayerFragment.lambda$setupView$10(view);
                break;
            case 10:
                xMPlayerFragment.lambda$setupView$11(view);
                break;
            case 11:
                xMPlayerFragment.lambda$setupView$12(view);
                break;
            default:
                xMPlayerFragment.lambda$setupView$13(view);
                break;
        }
    }
}
