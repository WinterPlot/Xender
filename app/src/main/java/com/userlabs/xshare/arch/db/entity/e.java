package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private long a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getApp_name() {
        return this.c;
    }

    public String getApp_name_search_key() {
        return this.d;
    }

    public String getLike_key() {
        return this.e;
    }

    public String getPkg_name() {
        return this.b;
    }

    public long getRowid() {
        return this.a;
    }

    public void setApp_name(String str) {
        this.c = str;
    }

    public void setApp_name_search_key(String str) {
        this.d = str;
    }

    public void setLike_key(String str) {
        this.e = str;
    }

    public void setPkg_name(String str) {
        this.b = str;
    }

    public void setRowid(long j) {
        this.a = j;
    }
}
