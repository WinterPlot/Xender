package com.userlabs.xshare.disconnect;

import androidx.lifecycle.h0;
import com.userlabs.xshare.range.RangeTaskRepository;
import com.userlabs.xshare.social.SocialSupport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ i(int i, h0 h0Var) {
        this.a = i;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h0 h0Var = this.b;
        switch (i) {
            case 0:
                j.lambda$getShowViewPagerPositionLiveDate$13(h0Var);
                break;
            case 1:
                j.lambda$getShowViewPagerPositionLiveDate$14(h0Var);
                break;
            case 2:
                j.lambda$getShowViewPagerPositionLiveDate$15(h0Var);
                break;
            case 3:
                j.lambda$getShowViewPagerPositionLiveDate$16(h0Var);
                break;
            case 4:
                j.lambda$getShowViewPagerPositionLiveDate$17(h0Var);
                break;
            case 5:
                com.userlabs.xshare.jio.a.lambda$loadContent$0(h0Var);
                break;
            case 6:
                RangeTaskRepository.lambda$restoreTasks$15(h0Var);
                break;
            case 7:
                SocialSupport.lambda$loadSocial$0(h0Var);
                break;
            case 8:
                SocialSupport.lambda$loadSocialDir$2(h0Var);
                break;
            default:
                com.userlabs.xshare.ui.fragment.pc.state.a.lambda$loadWifiConnectStatus$1(h0Var);
                break;
        }
    }
}
