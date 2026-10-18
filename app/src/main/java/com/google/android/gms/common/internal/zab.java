package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new w();
    private final int a;
    private final String b;
    private final long c;
    private final int d;
    private final boolean e;

    public zab(int i, String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 4, this.d);
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
