package com.userlabs.xshare.audioplayer.exo;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ XPlayerFloatBar b;

    public /* synthetic */ e(XPlayerFloatBar xPlayerFloatBar, int i) {
        this.a = i;
        this.b = xPlayerFloatBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        XPlayerFloatBar xPlayerFloatBar = this.b;
        switch (i) {
            case 0:
                xPlayerFloatBar.lambda$initView$0(view);
                break;
            case 1:
                xPlayerFloatBar.lambda$initView$1(view);
                break;
            default:
                xPlayerFloatBar.lambda$createCloseBtn$2(view);
                break;
        }
    }
}
