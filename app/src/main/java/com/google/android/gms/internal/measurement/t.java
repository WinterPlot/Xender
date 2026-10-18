package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class t implements k {
    private final String a;
    private final Level b;
    private final Set c;
    private final iw d;
    private final int e;

    private t() {
        this("", true, 2, Level.ALL, false, v.g, v.h);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final yv zza(String str) {
        return new v(this.a, str, true, 2, this.b, this.c, this.d, null);
    }

    public final t zzb(boolean z) {
        Set set = this.c;
        iw iwVar = this.d;
        return new t(this.a, true, 2, Level.OFF, false, set, iwVar);
    }

    private t(String str, boolean z, int i, Level level, boolean z2, Set set, iw iwVar) {
        this.a = "";
        this.e = 2;
        this.b = level;
        this.c = set;
        this.d = iwVar;
    }

    public /* synthetic */ t(byte[] bArr) {
        this("", true, 2, Level.ALL, false, v.g, v.h);
    }
}
