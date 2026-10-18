package androidx.media3.common.util;

import com.userlabs.xshare.videoplayer.common.XVideoView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(XVideoView xVideoView, boolean z, boolean z2, Runnable runnable) {
        this.a = 2;
        this.e = xVideoView;
        this.c = z;
        this.d = z2;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        boolean z = this.d;
        boolean z2 = this.c;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((q0) obj2).lambda$postUpdateWakeLock$2((AtomicBoolean) obj, z2, z);
                break;
            case 1:
                ((r0) obj2).lambda$postUpdateWifiLock$2((AtomicBoolean) obj, z2, z);
                break;
            default:
                ((XVideoView) obj2).lambda$release$1(z2, z, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ p0(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.a = i;
        this.e = obj;
        this.b = atomicBoolean;
        this.c = z;
        this.d = z2;
    }
}
