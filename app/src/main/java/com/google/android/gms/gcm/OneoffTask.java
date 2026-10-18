package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.b0;

/* JADX INFO: loaded from: classes4.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new i();
    private final long k;
    private final long l;

    private OneoffTask(a aVar) {
        super(aVar);
        this.k = aVar.j;
        this.l = aVar.k;
    }

    public long getWindowEnd() {
        return this.l;
    }

    public long getWindowStart() {
        return this.k;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.k);
        bundle.putLong("window_end", this.l);
    }

    public String toString() {
        String string = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        StringBuilder sb = new StringBuilder(string.length() + 64);
        sb.append(string);
        sb.append(" windowStart=");
        sb.append(windowStart);
        return androidx.versionedparcelable.b.m(windowEnd, " windowEnd=", sb);
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
    }

    public static class a extends Task.a {
        private long j = -1;
        private long k = -1;

        public a() {
            this.e = false;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public OneoffTask build() {
            checkConditions();
            return new OneoffTask(this, (i) null);
        }

        @Override // com.google.android.gms.gcm.Task.a
        public void checkConditions() {
            super.checkConditions();
            long j = this.j;
            if (j != -1) {
                long j2 = this.k;
                if (j2 != -1) {
                    if (j < j2) {
                        return;
                    }
                    b0.i("Window start must be shorter than window end.");
                    return;
                }
            }
            b0.i("Must specify an execution window using setExecutionWindow.");
        }

        public a setExecutionWindow(long j, long j2) {
            this.j = j;
            this.k = j2;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setService(Class<? extends GcmTaskService> cls) {
            this.b = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setExtras(Bundle bundle) {
            this.i = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setPersisted(boolean z) {
            this.e = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setRequiredNetwork(int i) {
            this.a = i;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setRequiresCharging(boolean z) {
            this.f = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setTag(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public a setUpdateCurrent(boolean z) {
            this.d = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public /* bridge */ /* synthetic */ Task.a setService(Class cls) {
            return setService((Class<? extends GcmTaskService>) cls);
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.k = parcel.readLong();
        this.l = parcel.readLong();
    }

    public /* synthetic */ OneoffTask(Parcel parcel, i iVar) {
        this(parcel);
    }

    public /* synthetic */ OneoffTask(a aVar, i iVar) {
        this(aVar);
    }
}
