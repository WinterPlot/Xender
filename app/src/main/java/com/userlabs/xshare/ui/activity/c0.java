package com.userlabs.xshare.ui.activity;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SplashActivity b;

    public /* synthetic */ c0(SplashActivity splashActivity, int i) {
        this.a = i;
        this.b = splashActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SplashActivity splashActivity = this.b;
        switch (i) {
            case 0:
                splashActivity.lambda$requestMiuiNetCard$0(view);
                break;
            case 1:
                splashActivity.lambda$showA03TipsDialog$5(view);
                break;
            default:
                splashActivity.lambda$showA03TipsDialog$6(view);
                break;
        }
    }
}
