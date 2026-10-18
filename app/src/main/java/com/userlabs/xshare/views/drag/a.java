package com.userlabs.xshare.views.drag;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private boolean a;
    private int b;
    private int c;
    private int d = 1;

    public a(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public int getAllCount() {
        return this.b + this.c;
    }

    public int getReceiveCount() {
        return this.c;
    }

    public int getSendCount() {
        return this.b;
    }

    public int getShowType() {
        return this.d;
    }

    public boolean isShow() {
        return this.a;
    }

    public void setReceiveCount(int i) {
        this.c = i;
    }

    public void setSendCount(int i) {
        this.b = i;
    }

    public void setShow(boolean z) {
        this.a = z;
    }

    public void setShowType(boolean z) {
        this.d = z ? 2 : 1;
    }
}
