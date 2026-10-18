package androidx.media3.exoplayer.util;

import androidx.media3.common.util.k;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class c implements d {
    final /* synthetic */ Executor a;
    final /* synthetic */ k b;

    public c(Executor executor, k kVar) {
        this.a = executor;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // androidx.media3.exoplayer.util.d
    public void release() {
        this.b.accept(this.a);
    }
}
