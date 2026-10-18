package androidx.tracing;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public String a;
    public int b;
    public boolean c;
    public long d;
    public double e;
    public String f;

    public /* synthetic */ t(String str, int i, boolean z, long j, double d, String str2, int i2, r rVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? "" : str2);
    }

    public final void reset() {
        this.a = null;
        this.b = 0;
        this.c = false;
        this.d = 0L;
        this.e = 0.0d;
        this.f = "";
    }

    public t(String str, int i, boolean z, long j, double d, String str2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = d;
        this.f = str2;
    }

    public t() {
        this(null, 0, false, 0L, 0.0d, null, 63, null);
    }
}
