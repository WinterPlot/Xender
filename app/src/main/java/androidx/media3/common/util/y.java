package androidx.media3.common.util;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((w.e) obj2).lambda$onReceive$0((Context) obj);
                break;
            case 1:
                ((q0.a) obj2).lambda$forceReleaseWakeLock$0((AtomicBoolean) obj);
                break;
            case 2:
                ((r0.a) obj2).lambda$forceReleaseWifiLock$0((AtomicBoolean) obj);
                break;
            case 3:
                ((c) obj2).lambda$updateStateAsync$1((com.google.common.base.e) obj);
                break;
            case 4:
                ((w) obj2).lambda$new$0((Context) obj);
                break;
            case 5:
                n0.lambda$transformFutureAsync$1((com.google.common.util.concurrent.m0) obj2, (ListenableFuture) obj);
                break;
            case 6:
                ((q0) obj2).lambda$postUpdateWakeLock$1((AtomicBoolean) obj);
                break;
            default:
                ((r0) obj2).lambda$postUpdateWifiLock$1((AtomicBoolean) obj);
                break;
        }
    }
}
