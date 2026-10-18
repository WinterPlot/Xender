package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new t0();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public int getBatchPeriodMillis() {
        return this.d;
    }

    public int getMaxMethodInvocationsInBatch() {
        return this.e;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.b;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.c;
    }

    public int getVersion() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, getVersion());
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 4, getBatchPeriodMillis());
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
