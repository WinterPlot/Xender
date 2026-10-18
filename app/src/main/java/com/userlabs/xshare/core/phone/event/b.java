package com.userlabs.xshare.core.phone.event;

import com.userlabs.xshare.multiplatformconnection.client.MPCClientData;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private int a;
    private String b;
    private String c;

    public b(String str, int i, String str2) {
        this.c = str;
        this.a = i;
        this.b = str2;
    }

    public static b allOfflineEvent() {
        return new b(12);
    }

    public static b someoneOfflineEvent(String str, String str2) {
        return new b(str, 11, str2);
    }

    public static b someoneOnlineEvent(String str, String str2) {
        return new b(str, 10, str2);
    }

    public String getPerson() {
        return this.c;
    }

    public boolean isAllOfflineEvent() {
        return this.a == 12;
    }

    public boolean isOnlineEvent() {
        return this.a == 10;
    }

    public boolean isPlatformAndroid() {
        return MPCClientData.PLATFORM_ANDROID.equals(this.b);
    }

    public boolean isPlatformPhone() {
        return MPCClientData.PLATFORM_ANDROID.equals(this.b) || MPCClientData.PLATFORM_IOS.equals(this.b);
    }

    public boolean isSomeoneOfflineEvent() {
        return this.a == 11;
    }

    public b(int i) {
        this.a = i;
    }
}
