package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements androidx.media3.common.util.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ z.a b;
    public final /* synthetic */ s c;
    public final /* synthetic */ v d;

    public /* synthetic */ y(z.a aVar, s sVar, v vVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = sVar;
        this.d = vVar;
    }

    @Override // androidx.media3.common.util.k
    public final void accept(Object obj) {
        int i = this.a;
        v vVar = this.d;
        s sVar = this.c;
        z.a aVar = this.b;
        z zVar = (z) obj;
        switch (i) {
            case 0:
                aVar.lambda$loadCompleted$1(sVar, vVar, zVar);
                break;
            default:
                aVar.lambda$loadCanceled$2(sVar, vVar, zVar);
                break;
        }
    }
}
