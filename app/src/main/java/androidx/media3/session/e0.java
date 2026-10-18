package androidx.media3.session;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((f0) obj).lambda$setController$1(runnable);
                break;
            case 1:
                ((u2) obj).postOrRunOnApplicationHandler(runnable);
                break;
            case 2:
                ((z2) obj).lambda$new$0(runnable);
                break;
            default:
                ((k3) obj).postOrRunOnApplicationHandler(runnable);
                break;
        }
    }
}
