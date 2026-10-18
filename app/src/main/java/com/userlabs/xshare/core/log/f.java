package com.userlabs.xshare.core.log;

import androidx.lifecycle.h0;
import com.userlabs.xshare.social.SocialSupport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(h0 h0Var, String str, int i) {
        this.a = i;
        this.b = h0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        h0 h0Var = this.b;
        switch (i) {
            case 0:
                h0Var.setValue(str);
                break;
            case 1:
                com.userlabs.xshare.core.phone.server.c.lambda$loadConnectionDataByDid$0(h0Var, str);
                break;
            case 2:
                com.userlabs.xshare.nlist.h.lambda$loadAutoActive$0(h0Var, str);
                break;
            default:
                SocialSupport.lambda$loadSocialItemByType$1(h0Var, str);
                break;
        }
    }
}
