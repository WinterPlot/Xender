package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w3 extends CountedCompleter {
    public final e2 a;
    public final int b;

    public w3(e2 e2Var) {
        this.a = e2Var;
        this.b = 0;
    }

    public abstract void a();

    public abstract w3 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.o() != 0) {
            this.setPendingCount(this.a.o() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iO = this.a.o() - 1;
                i = this.b;
                if (i2 < iO) {
                    w3 w3VarB = this.b(i2, i + iCount);
                    iCount = (int) (w3VarB.a.count() + ((long) iCount));
                    w3VarB.fork();
                    i2++;
                }
            }
            this = this.b(i2, i + iCount);
        }
        this.a();
        this.propagateCompletion();
    }

    public w3(w3 w3Var, e2 e2Var, int i) {
        super(w3Var);
        this.a = e2Var;
        this.b = i;
    }
}
