package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1.a b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ androidx.media3.exoplayer.source.v d;

    public /* synthetic */ f1(l1.a aVar, Pair pair, androidx.media3.exoplayer.source.v vVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = pair;
        this.d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        androidx.media3.exoplayer.source.v vVar = this.d;
        Pair pair = this.c;
        l1.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$onUpstreamDiscarded$4(pair, vVar);
                break;
            default:
                aVar.lambda$onDownstreamFormatChanged$5(pair, vVar);
                break;
        }
    }
}
