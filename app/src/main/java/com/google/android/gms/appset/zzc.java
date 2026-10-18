package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();
    private final String a;
    private final int b;

    public zzc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.b;
    }

    public final String zzb() {
        return this.a;
    }
}
