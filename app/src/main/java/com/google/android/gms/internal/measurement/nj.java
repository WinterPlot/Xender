package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class nj implements com.google.common.util.concurrent.j {
    static final /* synthetic */ nj a = new nj();

    private /* synthetic */ nj() {
    }

    @Override // com.google.common.util.concurrent.j
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        ApiException apiException = (ApiException) obj;
        throw new zzmk(apiException.getStatusCode(), apiException.getMessage(), apiException);
    }
}
