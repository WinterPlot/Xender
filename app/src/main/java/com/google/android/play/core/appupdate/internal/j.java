package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends a implements l {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.l
    public final void zzc(String str, Bundle bundle, n nVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        i.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(nVar);
        zzb(3, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.l
    public final void zzd(String str, Bundle bundle, n nVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        i.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(nVar);
        zzb(2, parcelZza);
    }
}
