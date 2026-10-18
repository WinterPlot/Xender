package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Handler {
    public a() {
        Looper.getMainLooper();
    }

    public a(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
