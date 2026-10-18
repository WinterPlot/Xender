package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v.a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ t(v.a aVar, int i, long j) {
        this.b = aVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        v.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$droppedFrames$3(i2, j);
                break;
            default:
                aVar.lambda$reportVideoFrameProcessingOffset$4(j, i2);
                break;
        }
    }

    public /* synthetic */ t(v.a aVar, long j, int i) {
        this.b = aVar;
        this.c = j;
        this.d = i;
    }
}
