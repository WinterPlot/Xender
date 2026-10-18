package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class zu extends av {
    private int f = 0;
    private final String b = "com/google/android/libraries/phenotype/client/Phlogger";
    private final String c = "logInternal";
    private final int d = 44;
    private final String e = "Phlogger.java";

    public /* synthetic */ zu(String str, String str2, int i, String str3, byte[] bArr) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zu) {
            zu zuVar = (zu) obj;
            if (this.c.equals(zuVar.c)) {
                String str = this.b;
                String str2 = zuVar.b;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            char cCharAt2 = str2.charAt(i);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + 44;
        this.f = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final String zza() {
        return this.b.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final String zzb() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final int zzc() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final String zzd() {
        String str = this.e;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final String zze() {
        return this.e;
    }
}
