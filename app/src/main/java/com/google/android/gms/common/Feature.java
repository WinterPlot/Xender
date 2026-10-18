package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new k();
    private final String a;

    @Deprecated
    private final int b;
    private final long c;
    private final boolean d;

    public Feature(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (com.google.android.gms.common.internal.l.equal(getName(), feature.getName()) && getVersion() == feature.getVersion() && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    public boolean getIsFullyRolledOut() {
        return this.d;
    }

    public String getName() {
        return this.a;
    }

    public long getVersion() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.l.hashCode(getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut()));
    }

    public final String toString() {
        com.google.android.gms.common.internal.l.a stringHelper = com.google.android.gms.common.internal.l.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        stringHelper.add("is_fully_rolled_out", Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.a.writeLong(parcel, 3, getVersion());
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 4, getIsFullyRolledOut());
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Feature(String str, int i, long j) {
        this(str, i, j, false);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }

    public Feature(String str, long j, boolean z) {
        this(str, -1, j, z);
    }
}
