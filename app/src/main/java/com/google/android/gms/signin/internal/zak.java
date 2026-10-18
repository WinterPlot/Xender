package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();
    final int a;
    private final ConnectionResult b;
    private final zay c;

    public zak(int i, ConnectionResult connectionResult, zay zayVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, this.a);
        com.google.android.gms.common.internal.safeparcel.a.writeParcelable(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.a.writeParcelable(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.b;
    }

    public final zay zab() {
        return this.c;
    }
}
