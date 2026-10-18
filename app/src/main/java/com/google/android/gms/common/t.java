package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.o1;
import com.google.android.gms.common.internal.p1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class t extends o1 {
    private final int a;

    public t(byte[] bArr) {
        com.google.android.gms.common.internal.m.checkArgument(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] zzf(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            okhttp3.b0.o(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarZzd;
        if (!(obj instanceof p1)) {
            return false;
        }
        try {
            p1 p1Var = (p1) obj;
            if (p1Var.zze() == this.a && (aVarZzd = p1Var.zzd()) != null) {
                return Arrays.equals(zzc(), (byte[]) com.google.android.gms.dynamic.b.unwrap(aVarZzd));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.o1, com.google.android.gms.common.internal.p1
    public final com.google.android.gms.dynamic.a zzd() {
        return com.google.android.gms.dynamic.b.wrap(zzc());
    }

    @Override // com.google.android.gms.common.internal.o1, com.google.android.gms.common.internal.p1
    public final int zze() {
        return this.a;
    }
}
