package com.google.android.gms.common.wrappers;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class d {
    private static final d b = new d();
    private c a = null;

    public static c packageManager(Context context) {
        return b.zza(context);
    }

    public final synchronized c zza(Context context) {
        c cVar;
        try {
            cVar = this.a;
            if (cVar == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar = new c(context);
                this.a = cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVar;
    }
}
