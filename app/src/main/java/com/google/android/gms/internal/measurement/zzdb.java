package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new ga();
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public zzdb(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 1, j);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.a.writeBundle(parcel, 7, this.d, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 8, this.e, false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
