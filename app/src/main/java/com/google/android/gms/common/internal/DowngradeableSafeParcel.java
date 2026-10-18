package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object b = new Object();
    private boolean a = false;

    public static boolean canUnparcelSafely(String str) {
        synchronized (b) {
        }
        return true;
    }

    public static Integer getUnparcelClientVersion() {
        synchronized (b) {
        }
        return null;
    }

    public abstract boolean prepareForClientVersion(int i);

    public void setShouldDowngrade(boolean z) {
        this.a = z;
    }

    public boolean shouldDowngrade() {
        return this.a;
    }
}
