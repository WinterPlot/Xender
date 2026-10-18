package androidx.camera.camera2.pipe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    private final long a;

    private /* synthetic */ p1(long j) {
        this.a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p1 m752boximpl(long j) {
        return new p1(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m754equalsimpl(long j, Object obj) {
        return (obj instanceof p1) && j == ((p1) obj).m758unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m755equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m756hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m757toStringimpl(long j) {
        return "RequestNumber(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m754equalsimpl(this.a, obj);
    }

    public final long getValue() {
        return this.a;
    }

    public int hashCode() {
        return m756hashCodeimpl(this.a);
    }

    public String toString() {
        return m757toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m758unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m753constructorimpl(long j) {
        return j;
    }
}
