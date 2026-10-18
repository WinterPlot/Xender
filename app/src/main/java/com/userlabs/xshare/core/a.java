package com.userlabs.xshare.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final com.userlabs.xshare.livedata.a<a> f = new com.userlabs.xshare.livedata.a<>();
    private String a;
    private int b;
    private boolean c;
    private String d;
    private String e;

    public a(String str, String str2, String str3, int i, boolean z) {
        this.a = str;
        this.e = str3;
        this.d = str2;
        this.b = i;
        this.c = z;
    }

    public static a apkClickInstall(String str, String str2, String str3, boolean z) {
        return new a(str, str2, str3, 10, z);
    }

    public static a apkInstalled(String str) {
        return new a(str, 0);
    }

    public static a apkInstllFailed(String str) {
        return new a(str, 11);
    }

    public static a apkUninstalled(String str) {
        return new a(str, 1);
    }

    public static a bundleStreamCommitedEvent(String str) {
        return new a(str, 12);
    }

    public static com.userlabs.xshare.livedata.a<a> getApkInstallEventXEvents() {
        return f;
    }

    public static void post(a aVar) {
        f.postValue(aVar);
    }

    public String getInstallName() {
        return this.e;
    }

    public String getInstallPath() {
        return this.d;
    }

    public String getPackageName() {
        return this.a;
    }

    public boolean isAppBundleStreamCommited() {
        return this.b == 12;
    }

    public boolean isAppInstallClicked() {
        return this.b == 10;
    }

    public boolean isAppInstallFailed() {
        return this.b == 11;
    }

    public boolean isAppInstalled() {
        return this.b == 0;
    }

    public boolean isAppUninstalled() {
        return this.b == 1;
    }

    public boolean isBundle() {
        return this.c;
    }

    public a(String str, String str2, int i) {
        this.e = str2;
        this.d = str;
        this.b = i;
    }

    public a(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public a(int i) {
        this.b = i;
    }
}
