package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class pp implements Closeable {

    @Nullable
    private final Closeable a;

    private pp(Closeable closeable) {
        this.a = closeable;
    }

    public static pp zza(Closeable closeable) {
        return new pp(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Nullable
    public final Closeable zzb() {
        return this.a;
    }
}
