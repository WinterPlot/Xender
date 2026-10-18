package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new k0();
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 4, this.d);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 7, this.g, false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 8, this.h);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 9, this.i);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }
}
