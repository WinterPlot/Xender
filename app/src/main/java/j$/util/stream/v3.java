package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends w3 {
    public final Object[] c;

    public v3(v3 v3Var, e2 e2Var, int i) {
        super(v3Var, e2Var, i);
        this.c = v3Var.c;
    }

    @Override // j$.util.stream.w3
    public final void a() {
        this.a.j(this.c, this.b);
    }

    @Override // j$.util.stream.w3
    public final w3 b(int i, int i2) {
        return new v3(this, this.a.a(i), i2);
    }

    public v3(e2 e2Var, Object[] objArr) {
        super(e2Var);
        this.c = objArr;
    }
}
