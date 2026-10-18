package com.userlabs.xshare.videoplayer.common;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$addPlayBackSpeedComponentIfNeed$0(view);
                break;
            case 1:
                cVar.lambda$initViews$10(view);
                break;
            case 2:
                cVar.lambda$addSleepTimeComponentIfNeed$1(view);
                break;
            case 3:
                cVar.lambda$initViews$3(view);
                break;
            case 4:
                cVar.lambda$initViews$4(view);
                break;
            case 5:
                cVar.lambda$initViews$5(view);
                break;
            case 6:
                cVar.lambda$initViews$6(view);
                break;
            case 7:
                cVar.lambda$initViews$7(view);
                break;
            case 8:
                cVar.lambda$initViews$8(view);
                break;
            default:
                cVar.lambda$initViews$9(view);
                break;
        }
    }
}
