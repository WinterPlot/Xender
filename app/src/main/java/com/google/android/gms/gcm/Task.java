package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import okhttp3.b0;

/* JADX INFO: loaded from: classes4.dex */
public class Task implements ReflectedParcelable {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final Set<Uri> f;
    private final boolean g;
    private final boolean h;
    private final l i;
    private final Bundle j;

    public static abstract class a {
        protected int a;
        protected String b;
        protected String c;
        protected boolean d;
        protected boolean e;
        protected boolean f;
        protected Set<Uri> g = Collections.EMPTY_SET;
        protected l h = l.d;
        protected Bundle i;

        public abstract Task build();

        public void checkConditions() {
            com.google.android.gms.common.internal.m.checkArgument(this.b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            com.google.android.gms.gcm.a.zzd(this.c);
            l lVar = this.h;
            if (lVar != null) {
                int iZzi = lVar.zzi();
                if (iZzi != 1 && iZzi != 0) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Must provide a valid RetryPolicy: ");
                    sb.append(iZzi);
                    throw new IllegalArgumentException(sb.toString());
                }
                int iZzj = lVar.zzj();
                int iZzk = lVar.zzk();
                if (iZzi == 0 && iZzj < 0) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("InitialBackoffSeconds can't be negative: ");
                    sb2.append(iZzj);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (iZzi == 1 && iZzj < 10) {
                    b0.i("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    return;
                } else if (iZzk < iZzj) {
                    int iZzk2 = lVar.zzk();
                    StringBuilder sb3 = new StringBuilder(77);
                    sb3.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                    sb3.append(iZzk2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.e) {
                Task.zzg(this.i);
            }
            if (!this.g.isEmpty() && this.a == 2) {
                b0.i("Required URIs may not be used with NETWORK_STATE_ANY");
                return;
            }
            Iterator<Uri> it = this.g.iterator();
            while (it.hasNext()) {
                Task.zzd(it.next());
            }
        }

        public abstract a setExtras(Bundle bundle);

        public abstract a setPersisted(boolean z);

        public abstract a setRequiredNetwork(int i);

        public abstract a setRequiresCharging(boolean z);

        public abstract a setService(Class<? extends GcmTaskService> cls);

        public abstract a setTag(String str);

        public abstract a setUpdateCurrent(boolean z);
    }

    @Deprecated
    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.e = 2;
        this.f = Collections.EMPTY_SET;
        this.g = false;
        this.h = false;
        this.i = l.d;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Uri uri) {
        if (uri == null) {
            b0.i("Null URI");
            return;
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || "null".equals(host)) {
            b0.i("URI hostname is required");
            return;
        }
        try {
            int port = uri.getPort();
            if (!"tcp".equals(scheme)) {
                if (!"ping".equals(scheme)) {
                    String strValueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(strValueOf) : new String("Unsupported required URI scheme: "));
                }
                if (port == -1) {
                    return;
                }
                b0.i("Ping does not support port numbers");
                return;
            }
            if (port <= 0 || port > 65535) {
                int port2 = uri.getPort();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid required URI port: ");
                sb.append(port2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (NumberFormatException e) {
            String strValueOf2 = String.valueOf(e.getMessage());
            throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Invalid port number: ".concat(strValueOf2) : new String("Invalid port number: "));
        }
    }

    public static void zzg(Bundle bundle) {
        if (bundle != null) {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize > 10240) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Extras exceeding maximum size(10240 bytes): ");
                sb.append(iDataSize);
                throw new IllegalArgumentException(sb.toString());
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (!(obj instanceof Bundle)) {
                        b0.i("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        return;
                    }
                    zzg((Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.j;
    }

    public int getRequiredNetwork() {
        return this.e;
    }

    public boolean getRequiresCharging() {
        return this.g;
    }

    public String getServiceName() {
        return this.a;
    }

    public String getTag() {
        return this.b;
    }

    public boolean isPersisted() {
        return this.d;
    }

    public boolean isUpdateCurrent() {
        return this.c;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("tag", this.b);
        bundle.putBoolean("update_current", this.c);
        bundle.putBoolean("persisted", this.d);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.e);
        if (!this.f.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Uri> it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.g);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.i.zzf(new Bundle()));
        bundle.putBundle("extras", this.j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public Task(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.a;
        this.f = aVar.g;
        this.g = aVar.f;
        this.h = false;
        this.j = aVar.i;
        l lVar = aVar.h;
        this.i = lVar == null ? l.d : lVar;
    }
}
