package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ca extends t8 implements da {
    public ca() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) u8.zzb(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            u8.zzf(parcel);
            zze(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public abstract /* synthetic */ void zze(String str, String str2, Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.da
    public abstract /* synthetic */ int zzf() throws RemoteException;
}
