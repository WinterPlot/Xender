package com.userlabs.xshare.obb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ObbImportItem implements Parcelable {
    public static final Parcelable.Creator<ObbImportItem> CREATOR = new a();
    public static int f = 0;
    public static int g = 1;
    public static int h = 2;
    private String a;
    private List<String> b;
    private int c;
    private String d;
    private String e;

    public ObbImportItem(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createStringArrayList();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.e;
    }

    public List<String> getObbResPaths() {
        return this.b;
    }

    public String getPackageName() {
        return this.a;
    }

    public String getSize() {
        return this.d;
    }

    public int getState() {
        return this.c;
    }

    public void readFromParcel(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createStringArrayList();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public void setName(String str) {
        this.e = str;
    }

    public void setObbResPaths(List<String> list) {
        this.b = list;
    }

    public void setPackageName(String str) {
        this.a = str;
    }

    public void setSize(String str) {
        this.d = str;
    }

    public void setState(int i) {
        this.c = i;
    }

    public void setStateImport() {
        this.c = f;
    }

    public void setStateImported() {
        this.c = h;
    }

    public void setStateImporting() {
        this.c = g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Parcelable.Creator<ObbImportItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObbImportItem createFromParcel(Parcel parcel) {
            return new ObbImportItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObbImportItem[] newArray(int i) {
            return new ObbImportItem[i];
        }
    }

    public ObbImportItem() {
    }
}
