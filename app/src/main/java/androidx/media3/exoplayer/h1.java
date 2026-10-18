package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1.a b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ androidx.media3.exoplayer.source.s d;
    public final /* synthetic */ androidx.media3.exoplayer.source.v e;

    public /* synthetic */ h1(l1.a aVar, Pair pair, androidx.media3.exoplayer.source.s sVar, androidx.media3.exoplayer.source.v vVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = pair;
        this.d = sVar;
        this.e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        androidx.media3.exoplayer.source.v vVar = this.e;
        androidx.media3.exoplayer.source.s sVar = this.d;
        Pair pair = this.c;
        l1.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$onLoadCanceled$2(pair, sVar, vVar);
                break;
            default:
                aVar.lambda$onLoadCompleted$1(pair, sVar, vVar);
                break;
        }
    }
}
