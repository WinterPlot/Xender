package com.userlabs.xshare.videoplayer.common;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements ViewStub.OnInflateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VPGuideFragment b;
    public final /* synthetic */ ViewStub c;

    public /* synthetic */ f(VPGuideFragment vPGuideFragment, ViewStub viewStub, int i) {
        this.a = i;
        this.b = vPGuideFragment;
        this.c = viewStub;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        int i = this.a;
        ViewStub viewStub2 = this.c;
        VPGuideFragment vPGuideFragment = this.b;
        switch (i) {
            case 0:
                vPGuideFragment.lambda$setupStep6$11(viewStub2, viewStub, view);
                break;
            case 1:
                vPGuideFragment.lambda$setupStep1$1(viewStub2, viewStub, view);
                break;
            case 2:
                vPGuideFragment.lambda$setupStep3$5(viewStub2, viewStub, view);
                break;
            case 3:
                vPGuideFragment.lambda$setupStep4$7(viewStub2, viewStub, view);
                break;
            case 4:
                vPGuideFragment.lambda$setupStep2$3(viewStub2, viewStub, view);
                break;
            default:
                vPGuideFragment.lambda$setupStep5$9(viewStub2, viewStub, view);
                break;
        }
    }
}
