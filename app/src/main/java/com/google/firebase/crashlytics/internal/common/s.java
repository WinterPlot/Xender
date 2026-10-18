package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.i c;

    public /* synthetic */ s(v vVar, com.google.firebase.crashlytics.internal.settings.i iVar, int i) {
        this.a = i;
        this.b = vVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        com.google.firebase.crashlytics.internal.settings.i iVar = this.c;
        v vVar = this.b;
        switch (i) {
            case 0:
                vVar.lambda$doBackgroundInitializationAsync$0(iVar);
                break;
            default:
                vVar.lambda$finishInitSynchronously$9(iVar);
                break;
        }
    }
}
