package com.userlabs.xshare.beans;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends i {
    private String x;
    private String y = "";

    public String getGroupKey() {
        return this.y;
    }

    public String getName_first_letter() {
        return this.x;
    }

    public void setGroupKey(String str) {
        this.y = str;
    }

    public void setName_first_letter(String str) {
        this.x = str;
    }
}
