package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class rp extends tp implements np {
    private final FileOutputStream a;
    private final File b;

    public rp(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // com.google.android.gms.internal.measurement.np
    public final File zza() {
        return this.b;
    }

    public final void zzb() throws IOException {
        this.a.getFD().sync();
    }
}
