package androidx.camera.video.internal.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioSource b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(AudioSource audioSource, boolean z, int i) {
        this.a = i;
        this.b = audioSource;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        AudioSource audioSource = this.b;
        switch (i) {
            case 0:
                audioSource.lambda$mute$7(z);
                break;
            default:
                audioSource.lambda$start$2(z);
                break;
        }
    }
}
