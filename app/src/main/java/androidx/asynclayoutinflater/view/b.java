package androidx.asynclayoutinflater.view;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c.C0032c b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, c.C0032c c0032c, int i) {
        this.a = i;
        this.c = obj;
        this.b = c0032c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c.C0032c c0032c = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((c.a) obj).lambda$handleMessage$0(c0032c);
                break;
            default:
                ((c.d) obj).lambda$runInner$0(c0032c);
                break;
        }
    }
}
