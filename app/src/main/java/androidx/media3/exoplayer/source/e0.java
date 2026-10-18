package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressiveMediaPeriod b;

    public /* synthetic */ e0(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.a = i;
        this.b = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.b;
        switch (i) {
            case 0:
                progressiveMediaPeriod.lambda$onLengthKnown$2();
                break;
            case 1:
                progressiveMediaPeriod.maybeFinishPrepare();
                break;
            default:
                progressiveMediaPeriod.lambda$new$0();
                break;
        }
    }
}
