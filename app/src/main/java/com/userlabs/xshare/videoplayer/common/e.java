package com.userlabs.xshare.videoplayer.common;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VPGuideFragment b;
    public final /* synthetic */ ViewStub c;

    public /* synthetic */ e(VPGuideFragment vPGuideFragment, ViewStub viewStub, int i) {
        this.a = i;
        this.b = vPGuideFragment;
        this.c = viewStub;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ViewStub viewStub = this.c;
        VPGuideFragment vPGuideFragment = this.b;
        switch (i) {
            case 0:
                vPGuideFragment.lambda$setupStep6$10(viewStub, view);
                break;
            case 1:
                vPGuideFragment.lambda$setupStep5$8(viewStub, view);
                break;
            case 2:
                vPGuideFragment.lambda$setupStep2$2(viewStub, view);
                break;
            case 3:
                vPGuideFragment.lambda$setupStep4$6(viewStub, view);
                break;
            case 4:
                vPGuideFragment.lambda$setupStep3$4(viewStub, view);
                break;
            default:
                vPGuideFragment.lambda$setupStep1$0(viewStub, view);
                break;
        }
    }
}
