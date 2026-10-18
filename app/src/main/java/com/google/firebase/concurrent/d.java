package com.google.firebase.concurrent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ i.b c;

    public /* synthetic */ d(Runnable runnable, i.b bVar, int i) {
        this.a = i;
        this.b = runnable;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                h.lambda$scheduleWithFixedDelay$9(this.b, this.c);
                break;
            case 1:
                h.lambda$schedule$0(this.b, this.c);
                break;
            default:
                h.lambda$scheduleAtFixedRate$6(this.b, this.c);
                break;
        }
    }
}
