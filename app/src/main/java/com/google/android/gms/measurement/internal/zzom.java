package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new od();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 1, j);
        com.google.android.gms.common.internal.safeparcel.a.writeByteArray(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.a.writeBundle(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 6, this.f);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 7, this.g, false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
