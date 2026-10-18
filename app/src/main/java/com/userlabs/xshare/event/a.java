package com.userlabs.xshare.event;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static com.userlabs.xshare.livedata.a<a> c = new com.userlabs.xshare.livedata.a<>();
    boolean a;
    int b;

    public a(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static com.userlabs.xshare.livedata.a<a> getEvents() {
        return c;
    }

    public static void post(a aVar) {
        c.postValue(aVar);
    }

    public int getNetWorkType() {
        return this.b;
    }

    public boolean isNetworkAvailable() {
        return this.a;
    }
}
