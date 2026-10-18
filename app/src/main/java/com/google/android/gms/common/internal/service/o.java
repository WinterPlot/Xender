package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends com.google.android.gms.internal.base.a implements IInterface {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(n nVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.c.zac(parcelZaa, nVar);
        zad(1, parcelZaa);
    }
}
