package com.userlabs.xshare.ui.activity;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MeActivity b;

    public /* synthetic */ q(MeActivity meActivity, int i) {
        this.a = i;
        this.b = meActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MeActivity meActivity = this.b;
        switch (i) {
            case 0:
                meActivity.lambda$onCreate$0(view);
                break;
            case 1:
                meActivity.lambda$onCreate$1(view);
                break;
            case 2:
                meActivity.lambda$onCreate$2(view);
                break;
            case 3:
                meActivity.lambda$onCreate$3(view);
                break;
            default:
                meActivity.lambda$initMePeople$6(view);
                break;
        }
    }
}
