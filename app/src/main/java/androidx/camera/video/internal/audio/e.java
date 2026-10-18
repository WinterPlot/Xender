package androidx.camera.video.internal.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioSource.c b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e(AudioSource.c cVar, boolean z, int i) {
        this.a = i;
        this.b = cVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onSilenceStateChanged(this.c);
                break;
            default:
                this.b.onSuspendStateChanged(this.c);
                break;
        }
    }
}
