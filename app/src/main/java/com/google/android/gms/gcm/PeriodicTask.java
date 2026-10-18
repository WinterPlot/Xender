package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.b0;

/* JADX INFO: loaded from: classes4.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR = new k();
    protected long k;
    protected long l;

    private PeriodicTask(a aVar) {
        super(aVar);
        this.k = -1L;
        this.l = -1L;
        this.k = aVar.j;
        this.l = Math.min(aVar.k, this.k);
    }

    public long getFlex() {
        return this.l;
    }

    public long getPeriod() {
        return this.k;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.k);
        bundle.putLong("period_flex", this.l);
    }

    public String toString() {
        String string = super.toString();
        long period = getPeriod();
        long flex = getFlex();
        StringBuilder sb = new StringBuilder(string.length() + 54);
        sb.append(string);
        sb.append(" period=");
        sb.append(period);
        return androidx.versionedparcelable.b.m(flex, " flex=", sb);
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
            this.e = true;
        }

        @Override // com.google.android.gms.gcm.Task.a
        public PeriodicTask build() {
            checkConditions();
            return new PeriodicTask(this, (k) null);
        }

        @Override // com.google.android.gms.gcm.Task.a
        public void checkConditions() {
            super.checkConditions();
            long j = this.j;
            if (j == -1) {
                b0.i("Must call setPeriod(long) to establish an execution interval for this periodic task.");
                return;
            }
            if (j <= 0) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Period set cannot be less than or equal to 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
            long j2 = this.k;
            if (j2 == -1) {
                this.k = (long) (j * 0.1f);
            } else if (j2 > j) {
                this.k = j;
            }
        }

        public a setFlex(long j) {
            this.k = j;
            return this;
        }

        public a setPeriod(long j) {
            this.j = j;
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
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.k = -1L;
        this.l = -1L;
        this.k = parcel.readLong();
        this.l = Math.min(parcel.readLong(), this.k);
    }

    public /* synthetic */ PeriodicTask(Parcel parcel, k kVar) {
        this(parcel);
    }

    public /* synthetic */ PeriodicTask(a aVar, k kVar) {
        this(aVar);
    }
}
