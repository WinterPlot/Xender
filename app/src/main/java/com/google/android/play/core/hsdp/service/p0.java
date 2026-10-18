package com.google.android.play.core.hsdp.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class p0 implements ServiceConnection {
    final /* synthetic */ r0 a;

    public /* synthetic */ p0(r0 r0Var, q0 q0Var) {
        Objects.requireNonNull(r0Var);
        this.a = r0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.a.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.n0
            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = this.a;
                r0 r0Var = p0Var.a;
                r0Var.k = (IInterface) r0Var.h.zza(iBinder);
                Log.i("ServiceConnMgrImpl", "notifyOnConnected");
                r0.zzp(r0Var);
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "linkToDeath");
                }
                try {
                    IInterface iInterface = r0Var.k;
                    if (iInterface == null) {
                        throw null;
                    }
                    iInterface.asBinder().linkToDeath(r0Var.i, 0);
                    r0 r0Var2 = p0Var.a;
                    r0Var2.f = false;
                    synchronized (r0Var2.d) {
                        try {
                            Iterator it = r0Var2.d.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            r0Var2.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    Log.e("ServiceConnMgrImpl", "linkToDeath failed", e);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        this.a.zzt(new Runnable() { // from class: com.google.android.play.core.hsdp.service.o0
            @Override // java.lang.Runnable
            public final void run() {
                r0 r0Var = this.a.a;
                if (r0Var.k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    IInterface iInterface = r0Var.k;
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath(r0Var.i, 0);
                    r0Var.k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    r0Var.zzs();
                }
                r0Var.f = false;
            }
        });
    }
}
