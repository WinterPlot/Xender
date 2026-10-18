package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w9 extends t8 implements x9 {
    public w9() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) u8.zzb(parcel, Bundle.CREATOR);
        u8.zzf(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(Bundle bundle) throws RemoteException;
}
