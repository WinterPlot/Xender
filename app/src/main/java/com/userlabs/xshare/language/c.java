package com.userlabs.xshare.language;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements a {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    public String getCountry() {
        return this.b;
    }

    public String getEnLanguageDisplayName() {
        return this.c;
    }

    public String getLanguage() {
        return this.a;
    }

    public String getSystemLanguageDisplayName() {
        return this.d;
    }

    public boolean isCurrentLanguage() {
        return this.e;
    }

    public void setCountry(String str) {
        this.b = str;
    }

    public void setCurrentLanguage(boolean z) {
        this.e = z;
    }

    public void setEnLanguageDisplayName(String str) {
        this.c = str;
    }

    public void setLanguage(String str) {
        this.a = str;
    }

    public void setSystemLanguageDisplayName(String str) {
        this.d = str;
    }
}
