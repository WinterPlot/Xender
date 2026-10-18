package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public interface cq {
    String zzc();

    InputStream zzd(Uri uri) throws IOException;

    boolean zze(Uri uri) throws IOException;

    File zzg(Uri uri) throws IOException;

    OutputStream zzj(Uri uri) throws IOException;

    void zzk(Uri uri) throws IOException;

    void zzl(Uri uri, Uri uri2) throws IOException;
}
