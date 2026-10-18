package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public class u3 extends w3 {
    public final Object c;

    public u3(u3 u3Var, d2 d2Var, int i) {
        super(u3Var, d2Var, i);
        this.c = u3Var.c;
    }

    @Override // j$.util.stream.w3
    public final void a() {
        ((d2) this.a).f(this.b, this.c);
    }

    @Override // j$.util.stream.w3
    public final w3 b(int i, int i2) {
        return new u3(this, ((d2) this.a).a(i), i2);
    }

    public u3(d2 d2Var, Object obj) {
        super(d2Var);
        this.c = obj;
    }
}
