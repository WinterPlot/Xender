package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c0 extends d0 {
    final /* synthetic */ Intent a;
    final /* synthetic */ com.google.android.gms.common.api.internal.k b;

    public c0(Intent intent, com.google.android.gms.common.api.internal.k kVar, int i) {
        this.a = intent;
        this.b = kVar;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void zaa() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
