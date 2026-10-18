package com.userlabs.xshare.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    protected Context a;

    public a(Context context) {
        this.a = context;
    }

    public static a newCompatAdapter(Context context) {
        return new b(context);
    }

    public ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }

    public abstract NetworkInfo getNetworkInfo(int i);

    public boolean isMobileConnected() {
        NetworkInfo networkInfo = getNetworkInfo(0);
        return networkInfo != null && networkInfo.isConnected();
    }

    public abstract boolean isVpnConnected();

    public boolean isWifiConnected() {
        NetworkInfo networkInfo = getNetworkInfo(1);
        return networkInfo != null && networkInfo.isConnected();
    }
}
