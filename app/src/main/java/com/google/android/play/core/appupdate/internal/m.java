package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.h
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) i.zza(parcel, Bundle.CREATOR);
            i.zzb(parcel);
            zzc(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) i.zza(parcel, Bundle.CREATOR);
        i.zzb(parcel);
        zzb(bundle2);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.internal.n
    public abstract /* synthetic */ void zzb(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.appupdate.internal.n
    public abstract /* synthetic */ void zzc(Bundle bundle) throws RemoteException;
}
