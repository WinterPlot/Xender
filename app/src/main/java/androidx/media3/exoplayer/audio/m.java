package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n.a b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ m(n.a aVar, Exception exc, int i) {
        this.a = i;
        this.b = aVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        n.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$audioCodecError$9(exc);
                break;
            default:
                aVar.lambda$audioSinkError$8(exc);
                break;
        }
    }
}
