package com.userlabs.xshare.res.loaders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Runnable {
    private Runnable a;

    public abstract void doWork();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            doWork();
        } catch (Throwable th) {
            if (com.userlabs.xshare.core.log.h.a) {
                if ((th instanceof IllegalStateException) || (th instanceof IllegalArgumentException)) {
                    com.userlabs.xshare.core.log.h.d("xd_local_file", "skip", th);
                } else {
                    com.userlabs.xshare.core.log.h.e("xd_local_file", "error", th);
                }
            }
            runFinalCallback();
        }
    }

    public final void runFinalCallback() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setFinalCallback(Runnable runnable) {
        this.a = runnable;
    }
}
