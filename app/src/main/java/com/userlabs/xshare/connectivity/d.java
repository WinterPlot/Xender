package com.userlabs.xshare.connectivity;

import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Network b;

    public /* synthetic */ d(Network network, int i) {
        this.a = i;
        this.b = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Network network = this.b;
        switch (i) {
            case 0:
                e.handleNetworkChangeEventAndSendEventByNetworkSync(network);
                break;
            default:
                com.userlabs.xshare.core.network.a.lambda$bindNetwork$1(network);
                break;
        }
    }
}
