package com.google.android.gms.iid;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class m implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ zze c;

    public m(zze zzeVar, Intent intent, Intent intent2) {
        this.c = zzeVar;
        this.a = intent;
        this.b = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.handleIntent(this.a);
        this.c.zzf(this.b);
    }
}
