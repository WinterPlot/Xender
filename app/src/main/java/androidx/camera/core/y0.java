package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.q0.a
    public final void onImageClose(i1 i1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x0.b) obj).lambda$new$1(i1Var);
                break;
            default:
                ((b2) obj).lambda$new$0(i1Var);
                break;
        }
    }
}
