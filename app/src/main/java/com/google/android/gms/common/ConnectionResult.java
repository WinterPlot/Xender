package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    final int a;
    private final int b;
    private final PendingIntent c;
    private final String d;
    private final Integer e;
    public static final ConnectionResult f = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new j();

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String zza(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.b == connectionResult.b && com.google.android.gms.common.internal.l.equal(this.c, connectionResult.c) && com.google.android.gms.common.internal.l.equal(this.d, connectionResult.d) && com.google.android.gms.common.internal.l.equal(this.e, connectionResult.e);
    }

    public Integer getClientMethodKey() {
        return this.e;
    }

    public int getErrorCode() {
        return this.b;
    }

    public String getErrorMessage() {
        return this.d;
    }

    public PendingIntent getResolution() {
        return this.c;
    }

    public boolean hasResolution() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.l.hashCode(Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public boolean isSuccess() {
        return this.b == 0;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.c;
            com.google.android.gms.common.internal.m.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public String toString() {
        com.google.android.gms.common.internal.l.a stringHelper = com.google.android.gms.common.internal.l.toStringHelper(this);
        stringHelper.add("statusCode", zza(this.b));
        stringHelper.add("resolution", this.c);
        stringHelper.add("message", this.d);
        stringHelper.add("clientMethodKey", this.e);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 2, getErrorCode());
        com.google.android.gms.common.internal.safeparcel.a.writeParcelable(parcel, 3, getResolution(), i, false);
        com.google.android.gms.common.internal.safeparcel.a.writeString(parcel, 4, getErrorMessage(), false);
        com.google.android.gms.common.internal.safeparcel.a.writeIntegerObject(parcel, 5, getClientMethodKey(), false);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str, Integer num) {
        this(1, i, pendingIntent, str, num);
    }
}
