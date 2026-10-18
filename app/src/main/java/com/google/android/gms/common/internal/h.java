package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface h extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends com.google.android.gms.internal.common.i implements h {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new m1(iBinder);
        }

        @Override // com.google.android.gms.internal.common.i
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.j.zzd(parcel2, accountZzb);
            return true;
        }

        @Override // com.google.android.gms.common.internal.h
        public abstract /* synthetic */ Account zzb() throws RemoteException;
    }

    Account zzb() throws RemoteException;
}
