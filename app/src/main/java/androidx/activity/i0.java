package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements androidx.navigationevent.l {
    public final /* synthetic */ j0 a;

    public /* synthetic */ i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // androidx.navigationevent.l
    public final void onBackCompletedFallback() {
        j0.a.dispatcher$lambda$0(this.a);
    }
}
