package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends com.google.android.gms.internal.playcore_hsdp.a implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService");
    }

    @Override // com.google.android.play.core.hsdp.protocol.c
    public final void zzc(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.c.zzc(parcelZza, bundle);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.c
    public final void zzd(Bundle bundle, e eVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.c.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.c.zzd(parcelZza, eVar);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.c
    public final void zze(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.c.zzc(parcelZza, bundle);
        zzb(2, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.c
    public final void zzf(Bundle bundle, e eVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.c.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.c.zzd(parcelZza, eVar);
        zzb(1, parcelZza);
    }
}
