package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.uuid.Uuid;
import okio.k0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private final k0 a;
    private final boolean b;
    private final String c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final long h;
    private final int i;
    private final int j;
    private final Long k;
    private final Long l;
    private final Long m;
    private final Integer n;
    private final Integer o;
    private final Integer p;
    private final List<k0> q;

    public /* synthetic */ l(k0 k0Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, int i4, kotlin.jvm.internal.r rVar) {
        this(k0Var, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & Uuid.SIZE_BITS) == 0 ? j4 : -1L, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }

    public final l copy$okio(Integer num, Integer num2, Integer num3) {
        return new l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, num, num2, num3);
    }

    public final k0 getCanonicalPath() {
        return this.a;
    }

    public final List<k0> getChildren() {
        return this.q;
    }

    public final String getComment() {
        return this.c;
    }

    public final long getCompressedSize() {
        return this.e;
    }

    public final int getCompressionMethod() {
        return this.g;
    }

    public final long getCrc() {
        return this.d;
    }

    public final Long getCreatedAtMillis$okio() {
        Long l = this.m;
        if (l != null) {
            return Long.valueOf(o.filetimeToEpochMillis(l.longValue()));
        }
        Integer num = this.p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final int getDosLastModifiedAtDate() {
        return this.i;
    }

    public final int getDosLastModifiedAtTime() {
        return this.j;
    }

    public final Integer getExtendedCreatedAtSeconds() {
        return this.p;
    }

    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.o;
    }

    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.n;
    }

    public final Long getLastAccessedAtMillis$okio() {
        Long l = this.l;
        if (l != null) {
            return Long.valueOf(o.filetimeToEpochMillis(l.longValue()));
        }
        Integer num = this.o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long getLastModifiedAtMillis$okio() {
        Long l = this.k;
        if (l != null) {
            return Long.valueOf(o.filetimeToEpochMillis(l.longValue()));
        }
        Integer num = this.n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i = this.j;
        if (i != -1) {
            return o.dosDateTimeToEpochMillis(this.i, i);
        }
        return null;
    }

    public final Long getNtfsCreatedAtFiletime() {
        return this.m;
    }

    public final Long getNtfsLastAccessedAtFiletime() {
        return this.l;
    }

    public final Long getNtfsLastModifiedAtFiletime() {
        return this.k;
    }

    public final long getOffset() {
        return this.h;
    }

    public final long getSize() {
        return this.f;
    }

    public final boolean isDirectory() {
        return this.b;
    }

    public l(k0 k0Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        k0Var.getClass();
        str.getClass();
        this.a = k0Var;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = j4;
        this.i = i2;
        this.j = i3;
        this.k = l;
        this.l = l2;
        this.m = l3;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = new ArrayList();
    }
}
