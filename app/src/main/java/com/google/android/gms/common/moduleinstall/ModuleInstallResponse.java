package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new e();
    private final int a;
    private final boolean b;

    public ModuleInstallResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public boolean areModulesAlreadyInstalled() {
        return this.a == 0;
    }

    public int getSessionId() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.a.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.a.writeInt(parcel, 1, getSessionId());
        com.google.android.gms.common.internal.safeparcel.a.writeBoolean(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.a.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zaa() {
        return this.b;
    }

    public ModuleInstallResponse(int i) {
        this(i, false);
    }
}
