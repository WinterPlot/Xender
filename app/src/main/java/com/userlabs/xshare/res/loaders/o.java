package com.userlabs.xshare.res.loaders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((p.a) obj).lambda$initMinId$0();
                break;
            case 1:
                ((p.a.C0356a) obj).lambda$new$0();
                break;
            default:
                ((j.a) obj).onUpdateEnd();
                break;
        }
    }
}
