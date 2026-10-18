package com.userlabs.xshare.jsbridge;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ BridgeWebView a;

    public /* synthetic */ c(BridgeWebView bridgeWebView) {
        this.a = bridgeWebView;
    }

    @Override // com.userlabs.xshare.jsbridge.g
    public final void onCallBack(String str) {
        this.a.handleFetchQueueData(str);
    }
}
