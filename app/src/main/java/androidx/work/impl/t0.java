package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ t0(u0 u0Var, int i) {
        this.a = i;
        this.b = u0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        u0 u0Var = this.b;
        switch (i) {
            case 0:
                return u0Var.lambda$rescheduleEligibleWork$0();
            default:
                return androidx.work.impl.utils.e.forAll$lambda$7(u0Var);
        }
    }
}
