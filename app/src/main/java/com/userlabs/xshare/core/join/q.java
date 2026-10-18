package com.userlabs.xshare.core.join;

import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class q {
    private Network a;
    private final String b;
    private WifiInfo c;
    private NetworkCapabilities d;
    private LinkProperties e;

    public q(String str) {
        this.b = ensureSsidValid(str);
    }

    private boolean acceptedWifiInfo(WifiInfo wifiInfo) {
        if (wifiInfo == null) {
            return false;
        }
        String wifiSSIDFromWifiInfo = com.userlabs.xshare.core.ap.utils.l.getWifiSSIDFromWifiInfo(wifiInfo);
        if (com.userlabs.xshare.core.log.h.a) {
            StringBuilder sbX = defpackage.a.x("ssid:", wifiSSIDFromWifiInfo, ",target ssid:");
            sbX.append(this.b);
            com.userlabs.xshare.core.log.h.d("join_ap", sbX.toString());
            com.userlabs.xshare.core.log.h.d("join_ap", "WifiInfo :" + wifiInfo);
        }
        return !TextUtils.isEmpty(wifiSSIDFromWifiInfo) && TextUtils.equals(wifiSSIDFromWifiInfo, this.b);
    }

    private String ensureSsidValid(String str) {
        return str.startsWith("\"") ? str.replace("\"", "") : str;
    }

    private WifiInfo getWifiInfoFromNetworkCapAPI29(NetworkCapabilities networkCapabilities) {
        TransportInfo transportInfo = networkCapabilities.getTransportInfo();
        if (transportInfo instanceof WifiInfo) {
            return (WifiInfo) transportInfo;
        }
        return null;
    }

    public boolean acceptAndSetAPI21(WifiInfo wifiInfo, NetworkCapabilities networkCapabilities, LinkProperties linkProperties, Network network) {
        if (!acceptedWifiInfo(wifiInfo) || !isWifiNetworkCapabilities(networkCapabilities) || !TextUtils.equals(com.userlabs.xshare.core.ap.utils.l.getIpAddressFromWifiInfo(wifiInfo), com.userlabs.xshare.core.ap.utils.l.getV4IpByLinkProperties(linkProperties))) {
            return false;
        }
        this.c = wifiInfo;
        this.d = networkCapabilities;
        this.e = linkProperties;
        this.a = network;
        return true;
    }

    public void acceptAndSetAPI29(NetworkCapabilities networkCapabilities, Network network) {
        if (networkCapabilities.hasTransport(1)) {
            if (this.a == null || acceptNetwork(network)) {
                WifiInfo wifiInfoFromNetworkCapAPI29 = getWifiInfoFromNetworkCapAPI29(networkCapabilities);
                if (wifiInfoFromNetworkCapAPI29 == null && Build.VERSION.SDK_INT < 31) {
                    wifiInfoFromNetworkCapAPI29 = com.userlabs.xshare.core.ap.utils.l.getWifiInfo(com.userlabs.xshare.core.c.getInstance());
                }
                if (acceptedWifiInfo(wifiInfoFromNetworkCapAPI29)) {
                    this.a = network;
                    this.c = wifiInfoFromNetworkCapAPI29;
                    this.d = networkCapabilities;
                }
            }
        }
    }

    public boolean acceptNetwork(Network network) {
        return network.equals(this.a);
    }

    public boolean checkParams() {
        return (this.c == null || this.e == null || this.d == null) ? false : true;
    }

    public Network getNetwork() {
        return this.a;
    }

    public int getWifiFrequency() {
        WifiInfo wifiInfo = this.c;
        if (wifiInfo != null) {
            return wifiInfo.getFrequency();
        }
        return 2412;
    }

    public String getWifiIpCompat() {
        LinkProperties linkProperties;
        WifiInfo wifiInfo = this.c;
        String ipAddressFromWifiInfo = wifiInfo != null ? com.userlabs.xshare.core.ap.utils.l.getIpAddressFromWifiInfo(wifiInfo) : null;
        return (TextUtils.isEmpty(ipAddressFromWifiInfo) && (linkProperties = this.e) != null) ? com.userlabs.xshare.core.ap.utils.l.getV4IpByLinkProperties(linkProperties) : ipAddressFromWifiInfo;
    }

    public boolean isValidatedNetworkCapabilities() {
        NetworkCapabilities networkCapabilities = this.d;
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    public boolean isWifiNetworkCapabilities() {
        NetworkCapabilities networkCapabilities = this.d;
        return networkCapabilities != null && isWifiNetworkCapabilities(networkCapabilities);
    }

    public void setLp(LinkProperties linkProperties) {
        this.e = linkProperties;
    }

    public void setNc(NetworkCapabilities networkCapabilities) {
        this.d = networkCapabilities;
    }

    public String toString() {
        return "XWifiNetworkInfo{Network=" + this.a + "\nWifiInfo=" + this.c + "\nCapabilities=" + this.d + "\nLinkProperties=" + this.e + "}";
    }

    public boolean isWifiNetworkCapabilities(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1);
    }

    public void acceptAndSetAPI29(LinkProperties linkProperties, Network network) {
        if (acceptNetwork(network)) {
            this.e = linkProperties;
        }
    }
}
