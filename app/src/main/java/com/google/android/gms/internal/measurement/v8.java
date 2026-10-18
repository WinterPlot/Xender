package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class v8 extends s8 implements x8 {
    public v8(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.x8
    public final Bundle zze(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        u8.zzc(parcelZza, bundle);
        Parcel parcelZzP = zzP(1, parcelZza);
        Bundle bundle2 = (Bundle) u8.zzb(parcelZzP, Bundle.CREATOR);
        parcelZzP.recycle();
        return bundle2;
    }
}
