package androidx.tracing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {
    private String a;
    private long b;
    private long c;
    private int d;
    private int e;
    private long f;

    public p0(String str, long j, long j2, int i, int i2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = j3;
    }

    public final String getName() {
        return this.a;
    }

    public final long getParentUuid() {
        return this.c;
    }

    public final int getPid() {
        return this.e;
    }

    public final long getTid() {
        return this.f;
    }

    public final int getType() {
        return this.d;
    }

    public final long getUuid() {
        return this.b;
    }

    public final void setName(String str) {
        this.a = str;
    }

    public final void setParentUuid(long j) {
        this.c = j;
    }

    public final void setPid(int i) {
        this.e = i;
    }

    public final void setTid(long j) {
        this.f = j;
    }

    public final void setType(int i) {
        this.d = i;
    }

    public final void setUuid(long j) {
        this.b = j;
    }
}
