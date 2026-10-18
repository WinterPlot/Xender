package com.userlabs.xshare.beans;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends a {
    private String a;
    private Object b;

    public k(String str) {
        this.a = str;
    }

    public static k createNew(String str) {
        return new k(str);
    }

    public String getParent_group() {
        return this.a;
    }

    public Object getTag() {
        return this.b;
    }

    public void setParent_group(String str) {
        this.a = str;
    }

    public void setTag(Object obj) {
        this.b = obj;
    }

    public k(Object obj) {
        this.b = obj;
    }
}
