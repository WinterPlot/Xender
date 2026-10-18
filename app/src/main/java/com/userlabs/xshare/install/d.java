package com.userlabs.xshare.install;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e.a) obj).lambda$onSuccess$0();
                break;
            case 1:
                ((e) obj).lambda$onInstallFailed$0();
                break;
            default:
                ((Installer) obj).lambda$postClickInstallEvent$0();
                break;
        }
    }
}
