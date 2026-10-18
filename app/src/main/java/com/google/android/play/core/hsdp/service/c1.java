package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
abstract class c1 extends com.google.android.play.core.hsdp.protocol.d {
    public /* synthetic */ c1(e1 e1Var) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.d, com.google.android.play.core.hsdp.protocol.e
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 9270);
        if (i == 9272) {
            zzd();
        } else if (i != 9281) {
            zzc(i);
        } else {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
        }
    }

    public abstract void zzc(int i);

    public abstract void zzd();
}
