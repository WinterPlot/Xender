package com.userlabs.xshare.arch.db.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class StatusEntity extends com.userlabs.xshare.beans.a implements Parcelable {
    public static final Parcelable.Creator<StatusEntity> CREATOR = new a();
    private static final String TAG = "StatusEntity";
    private String category;
    private String disPlayName;
    private long duration;
    private String durationStr;
    private boolean hasTodayData;
    private boolean isXShare;
    private String media_type;
    private long modifyTime;
    private String modifyTimeStr;
    private String path;
    private long size;
    private String strSize;

    public StatusEntity(Parcel parcel) {
        this.category = "";
        this.disPlayName = parcel.readString();
        this.path = parcel.readString();
        this.duration = parcel.readLong();
        this.size = parcel.readLong();
        this.strSize = parcel.readString();
        this.modifyTime = parcel.readLong();
        this.modifyTimeStr = parcel.readString();
        this.category = parcel.readString();
        this.durationStr = parcel.readString();
        this.isXShare = parcel.readByte() != 0;
        this.hasTodayData = parcel.readByte() != 0;
        this.media_type = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDisPlayName() {
        return this.disPlayName;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getDurationStr() {
        return this.durationStr;
    }

    public String getMedia_type() {
        return this.media_type;
    }

    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getModifyTimeStr() {
        return this.modifyTimeStr;
    }

    public String getPath() {
        return this.path;
    }

    public long getSize() {
        return this.size;
    }

    public String getStrSize() {
        return this.strSize;
    }

    public long getSys_files_id() {
        return 0L;
    }

    public boolean isHasTodayData() {
        return this.hasTodayData;
    }

    public boolean isXShare() {
        return this.isXShare;
    }

    public void readFromParcel(Parcel parcel) {
        this.disPlayName = parcel.readString();
        this.path = parcel.readString();
        this.duration = parcel.readLong();
        this.size = parcel.readLong();
        this.strSize = parcel.readString();
        this.modifyTime = parcel.readLong();
        this.modifyTimeStr = parcel.readString();
        this.category = parcel.readString();
        this.durationStr = parcel.readString();
        this.isXShare = parcel.readByte() != 0;
        this.hasTodayData = parcel.readByte() != 0;
        this.media_type = parcel.readString();
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDisPlayName(String str) {
        this.disPlayName = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setDurationStr(String str) {
        this.durationStr = str;
    }

    public void setHasTodayData(boolean z) {
        this.hasTodayData = z;
    }

    public void setMedia_type(String str) {
        this.media_type = str;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setModifyTimeStr(String str) {
        this.modifyTimeStr = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setStrSize(String str) {
        this.strSize = str;
    }

    public void setXShare(boolean z) {
        this.isXShare = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.disPlayName);
        parcel.writeString(this.path);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.size);
        parcel.writeString(this.strSize);
        parcel.writeLong(this.modifyTime);
        parcel.writeString(this.modifyTimeStr);
        parcel.writeString(this.category);
        parcel.writeString(this.durationStr);
        parcel.writeByte(this.isXShare ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasTodayData ? (byte) 1 : (byte) 0);
        parcel.writeString(this.media_type);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Parcelable.Creator<StatusEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusEntity createFromParcel(Parcel parcel) {
            return new StatusEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StatusEntity[] newArray(int i) {
            return new StatusEntity[i];
        }
    }

    public StatusEntity() {
        this.category = "";
    }
}
