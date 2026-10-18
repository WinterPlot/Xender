package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends com.google.android.gms.internal.playcore_hsdp.b implements j {
    public i() {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.b
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Bundle bundle = (Bundle) com.google.android.gms.internal.playcore_hsdp.c.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.playcore_hsdp.c.zzb(parcel);
            zzc(bundle);
        } else {
            if (i != 2) {
                return false;
            }
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.playcore_hsdp.c.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.playcore_hsdp.c.zzb(parcel);
            zzb(bundle2);
        }
        return true;
    }

    @Override // com.google.android.play.core.hsdp.protocol.j
    public abstract /* synthetic */ void zzb(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.hsdp.protocol.j
    public abstract /* synthetic */ void zzc(Bundle bundle) throws RemoteException;
}
