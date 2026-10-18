package com.userlabs.xshare.videoplayer.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e<Data> {
    private boolean a = false;
    private Object b;
    private Data c;

    public e(Data data) {
        this.c = data;
    }

    public Data getData() {
        if (this.a) {
            return null;
        }
        this.a = true;
        return this.c;
    }

    public Data getOriginalData() {
        return this.c;
    }

    public Object getTag() {
        return this.b;
    }

    public boolean isGeted() {
        return this.a;
    }

    public e<Data> setTag(Object obj) {
        this.b = obj;
        return this;
    }
}
