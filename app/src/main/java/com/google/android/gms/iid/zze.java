package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zze extends Service {
    private Binder b;
    private int d;
    final ExecutorService a = com.google.android.gms.internal.gcm.c.zzaa().zzd(new com.google.android.gms.common.util.concurrent.b("EnhancedIntentService"), 9);
    private final Object c = new Object();
    private int e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Binder pVar;
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            pVar = this.b;
            if (pVar == null) {
                pVar = new p(this);
                this.b = pVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pVar;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.a.execute(new m(this, intent, intent));
        return 3;
    }
}
