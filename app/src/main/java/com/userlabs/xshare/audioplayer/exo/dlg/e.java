package com.userlabs.xshare.audioplayer.exo.dlg;

import android.view.View;
import com.userlabs.xshare.audioplayer.exo.ui.XMpLyricsFragment;
import com.userlabs.xshare.ui.activity.AboutActivity;
import com.userlabs.xshare.videoplayer.dialog.VPSleepTimerLeftFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                XSleepTimerLeftFragment.lambda$onViewCreated$3(view);
                break;
            case 1:
                XMpLyricsFragment.lambda$setViewsListener$6(view);
                break;
            case 2:
                AboutActivity.lambda$onCreate$3(view);
                break;
            case 3:
                VPSleepTimerLeftFragment.lambda$onViewCreated$2(view);
                break;
            default:
                com.userlabs.xshare.videoplayer.floating.b.lambda$initFloatingWindowIfNeed$2(view);
                break;
        }
    }
}
