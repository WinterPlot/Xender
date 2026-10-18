package androidx.media3.common.util;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static Executor a;

    private a() {
    }

    public static synchronized Executor get() {
        Executor executorNewSingleThreadExecutor;
        executorNewSingleThreadExecutor = a;
        if (executorNewSingleThreadExecutor == null) {
            executorNewSingleThreadExecutor = n0.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            a = executorNewSingleThreadExecutor;
        }
        return executorNewSingleThreadExecutor;
    }

    public static synchronized void set(Executor executor) {
        a = executor;
    }
}
