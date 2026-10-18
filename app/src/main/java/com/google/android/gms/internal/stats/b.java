package com.google.android.gms.internal.stats;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements Closeable {
    private static final b a = new b(false, null);

    private b(boolean z, d dVar) {
    }

    public static b zza(boolean z, c cVar) {
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
