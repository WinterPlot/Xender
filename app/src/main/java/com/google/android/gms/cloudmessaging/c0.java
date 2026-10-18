package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class c0 {
    final int a;
    final com.google.android.gms.tasks.k b = new com.google.android.gms.tasks.k();
    final int c;
    final Bundle d;

    public c0(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean zZza = zza();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(zZza).length() + 1);
        androidx.constraintlayout.core.motion.utils.m.z(i, i2, "Request { what=", " id=", sb);
        sb.append(" oneWay=");
        sb.append(zZza);
        sb.append("}");
        return sb.toString();
    }

    public abstract boolean zza();

    public abstract void zzb(Bundle bundle);

    public final void zzc(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String strValueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", androidx.camera.camera2.pipe.w.u(new StringBuilder(string.length() + 16 + strValueOf.length()), "Finishing ", string, " with ", strValueOf));
        }
        this.b.setResult(obj);
    }

    public final void zzd(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String string2 = zztVar.toString();
            Log.d("MessengerIpcClient", androidx.camera.camera2.pipe.w.u(new StringBuilder(string.length() + 14 + string2.length()), "Failing ", string, " with ", string2));
        }
        this.b.setException(zztVar);
    }
}
