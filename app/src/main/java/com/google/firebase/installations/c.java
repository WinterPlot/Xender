package com.google.firebase.installations;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c(d dVar, boolean z, int i) {
        this.a = i;
        this.b = dVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.lambda$doRegistrationOrRefresh$3(z);
                break;
            default:
                dVar.lambda$getToken$2(z);
                break;
        }
    }
}
