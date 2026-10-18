package com.userlabs.xshare.obb;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class n {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;

    public n(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public String getPath() {
        return this.b;
    }

    public String getPkg() {
        return this.a;
    }

    public int getResCompleteCount() {
        return this.e;
    }

    public int getResTotalCount() {
        return this.d;
    }

    public int getState() {
        return this.c;
    }

    public void setPath(String str) {
        this.b = str;
    }

    public void setPkg(String str) {
        this.a = str;
    }

    public void setResCompleteCount(int i) {
        this.e = i;
    }

    public void setResTotalCount(int i) {
        this.d = i;
    }

    public void setState(int i) {
        this.c = i;
    }
}
