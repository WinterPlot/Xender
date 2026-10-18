package com.userlabs.xshare.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private static int a;

    public static void connectMPC() {
        a = 4;
    }

    public static void connectPC() {
        a = 2;
    }

    public static void connectPhone() {
        a = 1;
    }

    public static void exchangePhone() {
        a = 3;
    }

    public static boolean isConnectMPc() {
        return a == 4;
    }

    public static boolean isConnectPc() {
        return a == 2;
    }

    public static boolean isConnectPhone() {
        return a == 1;
    }

    public static boolean isExchangePhone() {
        return a == 3;
    }
}
