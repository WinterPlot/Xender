package org.apache.commons.io.function;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ b(c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c0 c0Var = this.b;
        switch (i) {
            case 0:
                a.run(c0Var);
                break;
            default:
                t0.run(c0Var);
                break;
        }
    }
}
