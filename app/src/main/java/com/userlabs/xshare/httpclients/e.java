package com.userlabs.xshare.httpclients;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private static final Pattern a = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\\\d.]+)", 2);

    private static boolean canParseAsIpAddress(String str) {
        return a.matcher(str).find();
    }

    public static boolean isLocalHostIp(String str) {
        try {
            return canParseAsIpAddress(str) && isLocalIp(str);
        } catch (Throwable unused) {
        }
    }

    private static boolean isLocalIp(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            return byName.isSiteLocalAddress() || byName.isAnyLocalAddress() || byName.isLoopbackAddress() || NetworkInterface.getByInetAddress(byName) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isLocalIpURI(URI uri) {
        try {
            return isLocalHostIp(uri.getHost());
        } catch (Throwable unused) {
            return false;
        }
    }
}
