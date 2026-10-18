package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new d0();
    private final Bundle a;

    public zzbf(Bundle bundle) {
        this.a = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new c0(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeBundle(parcel, 2, zzf(), false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Object zza(String str) {
        return this.a.get(str);
    }

    public final Long zzb(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public final Double zzc(String str) {
        return Double.valueOf(this.a.getDouble("value"));
    }

    public final String zzd(String str) {
        return this.a.getString(str);
    }

    public final int zze() {
        return this.a.size();
    }

    public final Bundle zzf() {
        return new Bundle(this.a);
    }

    public final /* synthetic */ Bundle zzg() {
        return this.a;
    }
}
