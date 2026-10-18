package androidx.camera.core;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a1(c1 c1Var, c1.h hVar, Executor executor) {
        this.b = c1Var;
        this.d = hVar;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Executor executor = this.c;
        Object obj = this.d;
        c1 c1Var = this.b;
        switch (i) {
            case 0:
                c1Var.lambda$takePicture$1(executor, (c1.f) obj);
                break;
            default:
                c1Var.lambda$takePicture$2((c1.h) obj, executor, null);
                break;
        }
    }

    public /* synthetic */ a1(c1 c1Var, Executor executor, c1.f fVar) {
        this.b = c1Var;
        this.c = executor;
        this.d = fVar;
    }
}
