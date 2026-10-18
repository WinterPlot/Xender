package com.userlabs.xshare.fastdownloader.main;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    ArrayList<Integer> a;

    public f(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a = arrayList;
        arrayList.add(Integer.valueOf(i));
    }

    public boolean isConnected(Context context) {
        if (this.a.contains(111)) {
            return true;
        }
        if (this.a.contains(1) && a.isInternetConnected(context)) {
            return true;
        }
        ArrayList<Integer> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Integer num = arrayList.get(i);
            i++;
            if (a.isInternetConnected(context, num.intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        public static int getNetworkClass(Context context) {
            int dataNetworkType = Build.VERSION.SDK_INT >= 24 ? ((TelephonyManager) context.getSystemService("phone")).getDataNetworkType() : ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
            if (dataNetworkType == 3 || dataNetworkType == 5 || dataNetworkType == 6 || dataNetworkType == 8 || dataNetworkType == 9 || dataNetworkType == 10 || dataNetworkType == 12 || dataNetworkType == 14 || dataNetworkType == 15) {
                return 4;
            }
            return dataNetworkType == 13 ? 3 : 5;
        }

        public static boolean isInternetConnected(Context context, int i) {
            if (context == null) {
                return false;
            }
            return isInternetConnectedOverM(context, i);
        }

        private static boolean isInternetConnectedBelowM(Context context, int i) {
            return false;
        }

        private static boolean isInternetConnectedOverM(Context context, int i) {
            if (context == null) {
                return false;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            switch (i) {
                case 1:
                    return true;
                case 2:
                    return networkCapabilities.hasTransport(0);
                case 3:
                    return getNetworkClass(context) == 3;
                case 4:
                    return getNetworkClass(context) == 4;
                case 5:
                    return getNetworkClass(context) == 5;
                case 6:
                    return networkCapabilities.hasTransport(1);
                default:
                    return false;
            }
        }

        public static boolean isInternetConnected(Context context) {
            return isInternetConnected(context, 1);
        }
    }
}
