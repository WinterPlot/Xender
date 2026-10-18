package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class h3 {
    final /* synthetic */ BasePendingResult a;

    public /* synthetic */ h3(BasePendingResult basePendingResult, byte[] bArr) {
        Objects.requireNonNull(basePendingResult);
        this.a = basePendingResult;
    }

    public final void finalize() throws Throwable {
        BasePendingResult.zal(this.a.zam());
        super.finalize();
    }
}
