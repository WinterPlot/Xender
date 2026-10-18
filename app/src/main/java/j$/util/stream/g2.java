package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g2 implements e2 {
    public final e2 a;
    public final e2 b;
    public final long c;

    public g2(e2 e2Var, e2 e2Var2) {
        this.a = e2Var;
        this.b = e2Var2;
        this.c = e2Var2.count() + e2Var.count();
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.e2
    public final int o() {
        return 2;
    }

}
