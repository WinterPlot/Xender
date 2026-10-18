package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    private int a = 1;

    public a addObject(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.a;
    }

    public final a zaa(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
        return this;
    }
}
