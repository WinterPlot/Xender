package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    private final a a;
    private final p b;
    private final p c;
    private boolean d;
    private boolean e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final Context a;
        private PowerManager.WakeLock b;

        public a(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWakeLock(AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new y(this, atomicBoolean, 1), "ExoPlayer:WakeLockManager").start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: forceReleaseWakeLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWakeLock$0(AtomicBoolean atomicBoolean) {
            PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.b) != null) {
                wakeLock.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void updateWakeLock(boolean z, boolean z2) {
            if (z) {
                if (this.b == null) {
                    if (this.a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        s.w("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
                    if (powerManager == null) {
                        s.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.b == null) {
                return;
            }
            boolean zShouldAcquireWakelock = q0.shouldAcquireWakelock(z, z2);
            PowerManager.WakeLock wakeLock = this.b;
            if (zShouldAcquireWakelock) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public q0(Context context, Looper looper, g gVar) {
        this.a = new a(context.getApplicationContext());
        this.b = gVar.createHandler(looper, null);
        this.c = gVar.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$0(boolean z, boolean z2) {
        this.a.updateWakeLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$1(AtomicBoolean atomicBoolean) {
        this.a.forceReleaseWakeLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$2(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.a.updateWakeLock(z, z2);
    }

    private void postUpdateWakeLock(boolean z, boolean z2) {
        if (shouldAcquireWakelock(z, z2)) {
            this.b.post(new o0(this, z, z2, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.postDelayed(new y(this, atomicBoolean, 6), 1000L);
        this.b.post(new p0(this, atomicBoolean, z, z2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWakelock(boolean z, boolean z2) {
        return z && z2;
    }

    public void setEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        postUpdateWakeLock(z, this.e);
    }

    public void setStayAwake(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (this.d) {
            postUpdateWakeLock(true, z);
        }
    }
}
