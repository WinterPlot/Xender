package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
abstract class d1 extends com.google.android.play.core.hsdp.protocol.d {
    public /* synthetic */ d1(e1 e1Var) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.d, com.google.android.play.core.hsdp.protocol.e
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 9270);
        if (i == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return;
        }
        if (i == 9282) {
            zzd();
            return;
        }
        switch (i) {
            case 9271:
                zzi();
                break;
            case 9272:
                zzh();
                break;
            case 9273:
                zzj();
                break;
            case 9274:
                zzc();
                break;
            case 9275:
                zzk();
                break;
            case 9276:
                zze();
                break;
            case 9277:
                zzg();
                break;
            default:
                zzf(i);
                break;
        }
    }

    public abstract void zzc();

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf(int i);

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract void zzj();

    public abstract void zzk();
}
