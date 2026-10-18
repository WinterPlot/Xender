package androidx.media3.common.util;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    private final a a;
    private final p b;
    private final p c;
    private boolean d;
    private boolean e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final Context a;
        private WifiManager.WifiLock b;

        public a(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWifiLock(AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new y(this, atomicBoolean, 2), "ExoPlayer:WifiLockManager").start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: forceReleaseWifiLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWifiLock$0(AtomicBoolean atomicBoolean) {
            WifiManager.WifiLock wifiLock;
            if (atomicBoolean.get() && (wifiLock = this.b) != null) {
                wifiLock.release();
            }
        }

        public void updateWifiLock(boolean z, boolean z2) {
            if (z && this.b == null) {
                if (this.a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    s.w("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    s.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            if (this.b == null) {
                return;
            }
            boolean zShouldAcquireWifilock = r0.shouldAcquireWifilock(z, z2);
            WifiManager.WifiLock wifiLock = this.b;
            if (zShouldAcquireWifilock) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public r0(Context context, Looper looper, g gVar) {
        this.a = new a(context.getApplicationContext());
        this.b = gVar.createHandler(looper, null);
        this.c = gVar.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$0(boolean z, boolean z2) {
        this.a.updateWifiLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$1(AtomicBoolean atomicBoolean) {
        this.a.forceReleaseWifiLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$2(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.a.updateWifiLock(z, z2);
    }

    private void postUpdateWifiLock(boolean z, boolean z2) {
        if (shouldAcquireWifilock(z, z2)) {
            this.b.post(new o0(this, z, z2, 1));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.postDelayed(new y(this, atomicBoolean, 7), 1000L);
        this.b.post(new p0(this, atomicBoolean, z, z2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWifilock(boolean z, boolean z2) {
        return z && z2;
    }

    public void setEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        postUpdateWifiLock(z, this.e);
    }

    public void setStayAwake(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (this.d) {
            postUpdateWifiLock(true, z);
        }
    }
}
