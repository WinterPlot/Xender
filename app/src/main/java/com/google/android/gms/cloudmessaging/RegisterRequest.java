package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new g0();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private int f;
    private final String g;

    public RegisterRequest(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 5, this.e, false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 6, this.f);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 7, this.g, false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zza(int i) {
        this.f = i;
    }

    public RegisterRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = str6;
    }
}
