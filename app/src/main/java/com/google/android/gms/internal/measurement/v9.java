package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class v9 extends s8 implements x9 {
    public v9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.x9
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        u8.zzc(parcelZza, bundle);
        zzc(1, parcelZza);
    }
}
