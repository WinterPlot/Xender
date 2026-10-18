package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class qp extends sp implements np {
    private final FileInputStream a;
    private final File b;

    private qp(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    public static qp zzb(File file) throws FileNotFoundException {
        return new qp(new FileInputStream(file), file);
    }

    @Override // com.google.android.gms.internal.measurement.np
    public final File zza() {
        return this.b;
    }
}
