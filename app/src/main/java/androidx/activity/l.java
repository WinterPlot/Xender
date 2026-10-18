package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity.e.execute$lambda$0((ComponentActivity.e) obj);
                break;
            case 1:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            default:
                a0.reportRunnable$lambda$0((a0) obj);
                break;
        }
    }
}
