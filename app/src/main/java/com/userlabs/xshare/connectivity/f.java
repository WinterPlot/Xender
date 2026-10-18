package com.userlabs.xshare.connectivity;

import com.userlabs.xshare.ui.activity.webview.BaseWebViewActivity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.userlabs.xshare.connectivity.c
    public final void onConnectivityChanged(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((g) obj).lambda$new$1(z);
                break;
            default:
                ((BaseWebViewActivity) obj).lambda$registerNetworkReceiver$4(z);
                break;
        }
    }
}
