package androidx.camera.camera2.pipe.core;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {
    private final Handler a;

    public g(Handler handler) {
        handler.getClass();
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.getClass();
        if (this.a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.a + " is shutting down");
    }
}
