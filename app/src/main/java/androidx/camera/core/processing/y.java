package androidx.camera.core.processing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((a0) obj).lambda$updateTransformation$3(i3, i2);
                break;
            case 1:
                ((androidx.camera.view.d) obj).lambda$setEnabledUseCases$2(i3, i2);
                break;
            default:
                com.userlabs.xshare.audioplayer.manager.c.lambda$postListener$0((com.userlabs.xshare.audioplayer.manager.c.a) obj, i3, i2);
                break;
        }
    }
}
