package com.userlabs.xshare.core.pc.client;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.lambda$setEstablished$3();
                break;
            case 1:
                gVar.lambda$handleCommandInternalBackground$11();
                break;
            case 2:
                gVar.lambda$inviteOk$4();
                break;
            case 3:
                gVar.lambda$setOffLineModeInitalMessage$13();
                break;
            case 4:
                gVar.lambda$handleCommandInternalBackground$6();
                break;
            default:
                gVar.lambda$handleCommandInternalBackground$7();
                break;
        }
    }
}
