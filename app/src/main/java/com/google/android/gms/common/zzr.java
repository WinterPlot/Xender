package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new a0();
    private final boolean a;

    @Nullable
    private final String b;
    private final int c;
    private final int d;
    private final long e;

    public zzr(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = g0.zza(i) - 1;
        this.d = l.zza(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 1, this.a);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 4, this.d);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 5, this.e);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.a;
    }

    @Nullable
    public final String zzb() {
        return this.b;
    }

    public final long zzc() {
        return this.e;
    }

    public final int zzd() {
        return g0.zza(this.c);
    }

    public final int zze() {
        return l.zza(this.d);
    }
}
