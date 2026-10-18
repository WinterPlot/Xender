package com.google.android.gms.gcm;

import android.os.Trace;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Closeable {
    private static final com.google.android.gms.iid.j<Boolean> b = com.google.android.gms.iid.i.zzy().zzd("nts.enable_tracing", true);
    private final boolean a;

    public p(String str) {
        boolean z = com.google.android.gms.common.util.p.isAtLeastJellyBeanMR2() && b.get().booleanValue();
        this.a = z;
        if (z) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            Trace.endSection();
        }
    }
}
