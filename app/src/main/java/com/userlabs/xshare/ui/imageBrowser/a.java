package com.userlabs.xshare.ui.imageBrowser;

import com.userlabs.xshare.upgrade.f;
import com.userlabs.xshare.util.n;
import com.userlabs.xshare.utils.t;
import com.userlabs.xshare.vdlist.k;
import com.userlabs.xshare.videoplayer.exo.ExoVideoPlayerActivity2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b.a.lambda$deleteTempFiles$3();
                break;
            case 1:
                f.lambda$sendMyVersionToFriend$2();
                break;
            case 2:
                n.lambda$exeDestroy$2();
                break;
            case 3:
                t.lambda$startWork$0();
                break;
            case 4:
                k.lambda$updateLocalVdPath$2();
                break;
            case 5:
                ExoVideoPlayerActivity2.lambda$onOrientationChanged$5();
                break;
            case 6:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                break;
            default:
                com.google.firebase.crashlytics.internal.concurrency.c.lambda$await$6();
                break;
        }
    }
}
