package com.userlabs.xshare.precondition;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l.a c;

    public /* synthetic */ j(l.a aVar, boolean z, int i) {
        this.a = i;
        this.c = aVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l.lambda$createHotspotPreConditionsReady$0(this.c, this.b);
                break;
            case 1:
                l.lambda$createHotspotPreConditionsReady$1(this.b, this.c);
                break;
            case 2:
                l.lambda$createP2pGroupPreConditionsReady$2(this.c, this.b);
                break;
            default:
                l.lambda$createP2pGroupPreConditionsReady$3(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ j(boolean z, l.a aVar, int i) {
        this.a = i;
        this.b = z;
        this.c = aVar;
    }
}
