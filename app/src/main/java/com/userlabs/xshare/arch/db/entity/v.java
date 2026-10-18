package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class v {
    private long a;
    private String b;
    private String c;
    private String d;

    public String getCategory() {
        return this.c;
    }

    public String getKeywords() {
        return this.b;
    }

    public String getPackageName() {
        return this.d;
    }

    public long getRowid() {
        return this.a;
    }

    public void setCategory(String str) {
        this.c = str;
    }

    public void setKeywords(String str) {
        this.b = str;
    }

    public void setPackageName(String str) {
        this.d = str;
    }

    public void setRowid(long j) {
        this.a = j;
    }
}
