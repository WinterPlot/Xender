package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class v {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((s) message.obj).recycle();
            return true;
        }
    }

    public synchronized void recycle(s<?> sVar, boolean z) {
        try {
            if (this.a || z) {
                this.b.obtainMessage(1, sVar).sendToTarget();
            } else {
                this.a = true;
                sVar.recycle();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
