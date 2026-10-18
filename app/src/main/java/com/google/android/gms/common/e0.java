package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class e0 extends f0 {
    private final Callable f;

    public /* synthetic */ e0(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f = callable;
    }

    @Override // com.google.android.gms.common.f0
    public final String zza() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            com.google.gson.internal.a.p(e);
            return null;
        }
    }
}
