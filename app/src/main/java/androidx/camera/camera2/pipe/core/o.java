package androidx.camera.camera2.pipe.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private final long a;

    private /* synthetic */ o(long j) {
        this.a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m345boximpl(long j) {
        return new o(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m347equalsimpl(long j, Object obj) {
        return (obj instanceof o) && j == ((o) obj).m353unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m348equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m349hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: minus-pEw-518, reason: not valid java name */
    public static final long m350minuspEw518(long j, long j2) {
        return f.m334constructorimpl(j - j2);
    }

    /* JADX INFO: renamed from: plus-rKz7-cU, reason: not valid java name */
    public static final long m351plusrKz7cU(long j, long j2) {
        return m346constructorimpl(j + j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m352toStringimpl(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m347equalsimpl(this.a, obj);
    }

    public final long getValue() {
        return this.a;
    }

    public int hashCode() {
        return m349hashCodeimpl(this.a);
    }

    public String toString() {
        return m352toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m353unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m346constructorimpl(long j) {
        return j;
    }
}
