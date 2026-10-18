package com.userlabs.xshare.views.piechart;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private float a;
    private int b;
    private Object c;

    public d(float f, int i) {
        this.c = null;
        this.a = f;
        this.b = i;
    }

    public float getVal() {
        return this.a;
    }

    public int getXIndex() {
        return this.b;
    }

    public String toString() {
        return "Entry, xIndex: " + this.b + " val (sum): " + getVal();
    }

    public d(float f, int i, Object obj) {
        this(f, i);
        this.c = obj;
    }
}
