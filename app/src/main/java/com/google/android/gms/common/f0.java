package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f0 {
    private static final f0 e = new f0(true, 3, 1, null, null, -1);
    final boolean a;

    @Nullable
    final String b;

    @Nullable
    final Throwable c;
    final int d;

    private f0(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th, long j) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    @Deprecated
    public static f0 zzb() {
        return e;
    }

    public static f0 zzc(String str) {
        return new f0(false, 1, 5, str, null, -1L);
    }

    public static f0 zzd(String str, Throwable th) {
        return new f0(false, 1, 5, str, th, -1L);
    }

    public static f0 zzf(int i, long j) {
        return new f0(true, i, 1, null, null, j);
    }

    public static f0 zzg(int i, int i2, String str, @Nullable Throwable th) {
        return new f0(false, i, i2, str, th, -1L);
    }

    @Nullable
    public String zza() {
        return this.b;
    }

    public final void zze() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.c;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    public /* synthetic */ f0(boolean z, int i, int i2, String str, Throwable th, long j, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
