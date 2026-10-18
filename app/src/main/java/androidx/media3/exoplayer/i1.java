package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1.a b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ i1(l1.a aVar, Pair pair, int i) {
        this.a = i;
        this.b = aVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pair pair = this.c;
        l1.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.lambda$onDrmKeysRemoved$10(pair);
                break;
            case 1:
                aVar.lambda$onDrmKeysRestored$9(pair);
                break;
            default:
                aVar.lambda$onDrmSessionReleased$11(pair);
                break;
        }
    }
}
