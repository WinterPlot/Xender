package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledFuture b;

    public /* synthetic */ i(ScheduledFuture scheduledFuture, int i) {
        this.a = i;
        this.b = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScheduledFuture scheduledFuture = this.b;
        switch (i) {
            case 0:
                scheduledFuture.cancel(true);
                break;
            default:
                scheduledFuture.cancel(true);
                break;
        }
    }
}
