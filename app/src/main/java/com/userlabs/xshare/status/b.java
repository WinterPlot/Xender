package com.userlabs.xshare.status;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a.d.C0363a) obj).lambda$mediaChanged$0();
                break;
            case 1:
                ((h.a) obj).lambda$copyFile$0();
                break;
            default:
                StatusesConfig.lambda$ensureXShareStatusesDirCreated$0((Runnable) obj);
                break;
        }
    }
}
