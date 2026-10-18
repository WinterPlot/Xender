package com.google.firebase.concurrent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ i.b d;

    public /* synthetic */ e(h hVar, Runnable runnable, i.b bVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = runnable;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i.b bVar = this.d;
        Runnable runnable = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                hVar.lambda$scheduleWithFixedDelay$10(runnable, bVar);
                break;
            case 1:
                hVar.lambda$scheduleAtFixedRate$7(runnable, bVar);
                break;
            default:
                hVar.lambda$schedule$1(runnable, bVar);
                break;
        }
    }
}
