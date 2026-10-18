package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ g1(i1 i1Var, i1 i1Var2, int i) {
        this.a = i;
        this.b = i1Var;
        this.c = i1Var2;
    }

    @Override // androidx.camera.core.q0.a
    public final void onImageClose(i1 i1Var) {
        int i = this.a;
        i1 i1Var2 = this.c;
        i1 i1Var3 = this.b;
        switch (i) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(i1Var3, i1Var2, i1Var);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(i1Var3, i1Var2, i1Var);
                break;
        }
    }
}
