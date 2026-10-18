package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e) obj).lambda$handleInputFrame$2();
                break;
            case 1:
                ((r.e) obj).lambda$onVsync$0();
                break;
            default:
                ((j) obj).lambda$flush$1();
                break;
        }
    }
}
