package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d) obj).updateCurrentAudioCapabilities();
                break;
            case 1:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0((androidx.media3.common.util.r) obj);
                break;
            default:
                ((y) obj).maybeReportSkippedSilence();
                break;
        }
    }
}
