package com.google.android.play.core.hsdp.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class ReportRequest implements Parcelable {
    public static final Parcelable.Creator<ReportRequest> CREATOR = new o();
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    private final long e;

    public /* synthetic */ ReportRequest(Parcel parcel, p pVar) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.a = string;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.d = string2;
        this.e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getOperation() {
        return this.b;
    }

    public int getReportCode() {
        return this.c;
    }

    public long getRequestTimestampMs() {
        return this.e;
    }

    public String getSdkVersion() {
        return this.d;
    }

    public String getTargetPackage() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
    }

    public ReportRequest(String str, int i, int i2, String str2, long j) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.a = str;
        this.b = i;
        this.c = i2;
        Objects.requireNonNull(str2, "sdkVersion cannot be null");
        this.d = str2;
        this.e = j;
    }
}
