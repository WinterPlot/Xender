package androidx.media3.exoplayer;

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
                ((k.b) obj).lambda$disable$2();
                break;
            case 1:
                ((k.c) obj).lambda$disable$2();
                break;
            case 2:
                ((l0) obj).lambda$new$3();
                break;
            default:
                ((e2.d) obj).lambda$onReceive$0();
                break;
        }
    }
}
