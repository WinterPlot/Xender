package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class PrewarmRequest implements Parcelable {
    public static final Parcelable.Creator<PrewarmRequest> CREATOR = new m();
    private final String a;
    private final String b;
    private final IBinder c;
    private final Bundle d;

    public /* synthetic */ PrewarmRequest(Parcel parcel, n nVar) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.a = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.b = string2;
        if (parcel.readByte() != 0) {
            this.c = parcel.readStrongBinder();
        } else {
            this.c = null;
        }
        Bundle bundle = parcel.readBundle(PrewarmRequest.class.getClassLoader());
        this.d = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return new Bundle(this.d);
    }

    public String getTargetPackage() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }

    public IBinder getWindowToken() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        IBinder iBinder = this.c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.d);
    }

    public PrewarmRequest(String str, String str2, IBinder iBinder, Bundle bundle) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.b = str2;
        this.c = iBinder;
        this.d = bundle != null ? new Bundle(bundle) : Bundle.EMPTY;
    }
}
