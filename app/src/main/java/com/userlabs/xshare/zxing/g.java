package com.userlabs.xshare.zxing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.userlabs.xshare.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final String e = "g";
    private final BroadcastReceiver a = new b(this, 0);
    private boolean b = false;
    private Context c;
    Handler d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends Handler {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, Runnable runnable) {
            super(looper);
            this.a = runnable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 121) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.i(g.e, "Finishing activity due to inactivity");
                }
                Runnable runnable = this.a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public g(Context context, Runnable runnable) {
        this.c = context;
        this.d = new a(Looper.getMainLooper(), runnable);
        onActivity();
    }

    public synchronized void cancel() {
        this.d.removeMessages(121);
    }

    public synchronized void onActivity() {
        cancel();
        this.d.sendEmptyMessageDelayed(121, 300000L);
    }

    public synchronized void onPause() {
        try {
            cancel();
            if (this.b) {
                this.c.unregisterReceiver(this.a);
                this.b = false;
            } else if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.i(e, "PowerStatusReceiver was never registered?");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onResume() {
        if (!this.b) {
            try {
                w.registerReceiverCompat(this.c, this.a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                this.b = true;
            } catch (Exception unused) {
            }
        } else if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.i(e, "PowerStatusReceiver was already registered?");
        }
        onActivity();
    }

    public void shutdown() {
        cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("plugged", -1);
                g gVar = g.this;
                if (intExtra <= 0) {
                    gVar.onActivity();
                } else {
                    gVar.cancel();
                }
            }
        }

        public /* synthetic */ b(g gVar, int i) {
            this();
        }
    }
}
