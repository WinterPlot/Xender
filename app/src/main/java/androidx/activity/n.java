package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return o.onBackPressedInput_delegate$lambda$0((o) obj);
            case 1:
                return o.onBackPressedDispatcher_delegate$lambda$0((o) obj);
            default:
                return j0.eventInput_delegate$lambda$0((j0) obj);
        }
    }
}
