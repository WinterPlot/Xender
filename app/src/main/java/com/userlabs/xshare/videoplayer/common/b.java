package com.userlabs.xshare.videoplayer.common;

import com.userlabs.xshare.videoplayer.dialog.VPMoreDialogFragment;
import com.userlabs.xshare.videoplayer.dialog.VPSleepTimerLeftFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements com.userlabs.xshare.videoplayer.sleeptimer.a.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.userlabs.xshare.videoplayer.sleeptimer.a.b
    public final void onTick(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c) obj).lambda$addSleepTimeComponentIfNeed$2(j);
                break;
            case 1:
                ((VPMoreDialogFragment) obj).lambda$onViewCreated$6(j);
                break;
            default:
                ((VPSleepTimerLeftFragment) obj).lambda$onViewCreated$1(j);
                break;
        }
    }
}
