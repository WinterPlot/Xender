package com.google.android.gms.iid;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
final class o implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ n b;

    public o(n nVar, Intent intent) {
        this.b = nVar;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String action = this.a.getAction();
        StringBuilder sb = new StringBuilder(61 + (action == null ? 0 : action.length()));
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.b.finish();
    }
}
