package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(c cVar, Object obj, int i) {
        this.a = i;
        this.b = cVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$setStateInBackground$2(obj);
                break;
            default:
                cVar.lambda$updateStateAsync$0(obj);
                break;
        }
    }
}
