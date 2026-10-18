package com.userlabs.xshare.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    public b(Context context) {
        super(context);
    }

    public NetworkCapabilities getNetworkCapabilities(int i) {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return null;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(i)) {
            return networkCapabilities;
        }
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities2 != null && networkCapabilities2.hasTransport(i)) {
                return networkCapabilities2;
            }
        }
        return null;
    }

    @Override // com.userlabs.xshare.connectivity.a
    public NetworkInfo getNetworkInfo(int i) {
        return null;
    }

    @Override // com.userlabs.xshare.connectivity.a
    public boolean isMobileConnected() {
        NetworkCapabilities networkCapabilities = getNetworkCapabilities(0);
        return networkCapabilities != null && networkCapabilities.hasTransport(0);
    }

    @Override // com.userlabs.xshare.connectivity.a
    public boolean isVpnConnected() {
        NetworkCapabilities networkCapabilities = getNetworkCapabilities(4);
        return networkCapabilities != null && networkCapabilities.hasTransport(4);
    }

    @Override // com.userlabs.xshare.connectivity.a
    public boolean isWifiConnected() {
        NetworkCapabilities networkCapabilities = getNetworkCapabilities(1);
        return (networkCapabilities == null || !networkCapabilities.hasTransport(1) || networkCapabilities.hasCapability(6)) ? false : true;
    }
}
