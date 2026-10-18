package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class y0 implements l {
    private final x0 a;

    public y0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // kotlinx.coroutines.l
    public void invoke(Throwable th) {
        this.a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
