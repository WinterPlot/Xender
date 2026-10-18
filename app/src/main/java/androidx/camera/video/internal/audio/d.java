package androidx.camera.video.internal.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioSource b;

    public /* synthetic */ d(AudioSource audioSource, int i) {
        this.a = i;
        this.b = audioSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AudioSource audioSource = this.b;
        switch (i) {
            case 0:
                audioSource.lambda$stop$3();
                break;
            default:
                audioSource.lambda$start$1();
                break;
        }
    }
}
