package com.google.android.material.search;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                nVar.hide();
                break;
            case 1:
                nVar.lambda$startShowAnimationExpand$0();
                break;
            default:
                nVar.lambda$startShowAnimationTranslate$1();
                break;
        }
    }
}
