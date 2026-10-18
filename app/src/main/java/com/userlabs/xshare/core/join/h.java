package com.userlabs.xshare.core.join;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    private final int a;
    private final String b;
    private final boolean c;
    private final int d;

    private h(boolean z, String str, int i, int i2) {
        this.c = z;
        this.b = str;
        this.a = i;
        this.d = i2;
    }

    public static h failedEvent(String str, int i) {
        return new h(false, str, i);
    }

    public static h successEvent(int i) {
        return new h(true, "", 1, i);
    }

    public String getFailedType() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    public int getWifiFrequency() {
        return this.d;
    }

    public boolean isSuccess() {
        return this.c;
    }

    public boolean isTypeExit() {
        return this.a == 2;
    }

    public boolean isWrongPassword() {
        return TextUtils.equals(this.b, "connect_wifi_failed_pwd_error");
    }

    private h(boolean z, String str, int i) {
        this(z, str, i, 0);
    }
}
