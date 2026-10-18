package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    private final String a;
    private final String b;
    private final String c;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getArch() {
        return this.b;
    }

    public String getBuildId() {
        return this.c;
    }

    public String getLibraryName() {
        return this.a;
    }
}
