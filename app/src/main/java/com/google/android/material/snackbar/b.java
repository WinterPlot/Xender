package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class b {
    private static b e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new a());
    private c c;
    private c d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.handleTimeout((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0582b {
        void dismiss(int i);

        void show();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        final WeakReference<InterfaceC0582b> a;
        int b;
        boolean c;

        public c(int i, InterfaceC0582b interfaceC0582b) {
            this.a = new WeakReference<>(interfaceC0582b);
            this.b = i;
        }

        public boolean isSnackbar(InterfaceC0582b interfaceC0582b) {
            return interfaceC0582b != null && this.a.get() == interfaceC0582b;
        }
    }

    private b() {
    }

    private boolean cancelSnackbarLocked(c cVar, int i) {
        InterfaceC0582b interfaceC0582b = cVar.a.get();
        if (interfaceC0582b == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        interfaceC0582b.dismiss(i);
        return true;
    }

    public static b getInstance() {
        b bVar = e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        e = bVar2;
        return bVar2;
    }

    private boolean isCurrentSnackbarLocked(InterfaceC0582b interfaceC0582b) {
        c cVar = this.c;
        return cVar != null && cVar.isSnackbar(interfaceC0582b);
    }

    private boolean isNextSnackbarLocked(InterfaceC0582b interfaceC0582b) {
        c cVar = this.d;
        return cVar != null && cVar.isSnackbar(interfaceC0582b);
    }

    private void scheduleTimeoutLocked(c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private void showNextSnackbarLocked() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            InterfaceC0582b interfaceC0582b = cVar.a.get();
            if (interfaceC0582b != null) {
                interfaceC0582b.show();
            } else {
                this.c = null;
            }
        }
    }

    public void dismiss(InterfaceC0582b interfaceC0582b, int i) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    cancelSnackbarLocked(this.c, i);
                } else if (isNextSnackbarLocked(interfaceC0582b)) {
                    cancelSnackbarLocked(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void handleTimeout(c cVar) {
        synchronized (this.a) {
            try {
                if (this.c == cVar || this.d == cVar) {
                    cancelSnackbarLocked(cVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCurrent(InterfaceC0582b interfaceC0582b) {
        boolean zIsCurrentSnackbarLocked;
        synchronized (this.a) {
            zIsCurrentSnackbarLocked = isCurrentSnackbarLocked(interfaceC0582b);
        }
        return zIsCurrentSnackbarLocked;
    }

    public boolean isCurrentOrNext(InterfaceC0582b interfaceC0582b) {
        boolean z;
        synchronized (this.a) {
            try {
                z = isCurrentSnackbarLocked(interfaceC0582b) || isNextSnackbarLocked(interfaceC0582b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void onDismissed(InterfaceC0582b interfaceC0582b) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    this.c = null;
                    if (this.d != null) {
                        showNextSnackbarLocked();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onShown(InterfaceC0582b interfaceC0582b) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    scheduleTimeoutLocked(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pauseTimeout(InterfaceC0582b interfaceC0582b) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void restoreTimeoutIfPaused(InterfaceC0582b interfaceC0582b) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        scheduleTimeoutLocked(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void show(int i, InterfaceC0582b interfaceC0582b) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(interfaceC0582b)) {
                    c cVar = this.c;
                    cVar.b = i;
                    this.b.removeCallbacksAndMessages(cVar);
                    scheduleTimeoutLocked(this.c);
                    return;
                }
                if (isNextSnackbarLocked(interfaceC0582b)) {
                    this.d.b = i;
                } else {
                    this.d = new c(i, interfaceC0582b);
                }
                c cVar2 = this.c;
                if (cVar2 == null || !cancelSnackbarLocked(cVar2, 4)) {
                    this.c = null;
                    showNextSnackbarLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
