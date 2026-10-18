package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.google.android.gms.internal.gcm.a implements g {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    @Override // com.google.android.gms.gcm.g
    public final void zzf(int i) throws RemoteException {
        Parcel parcelZzd = zzd();
        parcelZzd.writeInt(i);
        zzd(2, parcelZzd);
    }
}
