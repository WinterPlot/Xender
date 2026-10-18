package com.userlabs.xshare.ui.activity;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ l(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                mainActivity.lambda$observeNotificationClickEvent$16((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 1:
                mainActivity.lambda$delayCreate$1((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 2:
                mainActivity.lambda$delayCreate$11((com.userlabs.xshare.core.a) obj);
                break;
            case 3:
                mainActivity.lambda$delayCreate$12((com.userlabs.xshare.event.a) obj);
                break;
            case 4:
                mainActivity.lambda$delayCreate$13((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 5:
                mainActivity.lambda$delayCreate$14((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 6:
                mainActivity.lambda$delayCreate$2((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 7:
                mainActivity.lambda$delayCreate$3((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 8:
                mainActivity.lambda$delayCreate$4((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 9:
                mainActivity.lambda$delayCreate$5((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 10:
                mainActivity.lambda$delayCreate$6((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 11:
                mainActivity.lambda$delayCreate$7((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 12:
                mainActivity.lambda$delayCreate$8((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 13:
                mainActivity.lambda$delayCreate$9((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 14:
                mainActivity.lambda$delayCreate$10((com.userlabs.xshare.tobesend.b) obj);
                break;
            case 15:
                mainActivity.lambda$subscribeNeedOpenMediaFromOut$18((com.userlabs.xshare.arch.entry.b) obj);
                break;
            default:
                mainActivity.lambda$observeSplashAdIntent$17((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
