package com.userlabs.xshare.core.ap;

import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private WifiManager.WifiLock a;

    public void acquireWifiLock(WifiManager wifiManager) {
        try {
            WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "xshareWifiLock");
            this.a = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.acquire();
        } catch (Throwable unused) {
        }
    }

    public void releaseWifiLock() {
        try {
            WifiManager.WifiLock wifiLock = this.a;
            if (wifiLock != null) {
                wifiLock.release();
            }
        } catch (Throwable unused) {
        }
    }
}
