package androidx.camera.camera2.pipe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    private final long a;

    private /* synthetic */ t1(long j) {
        this.a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ t1 m790boximpl(long j) {
        return new t1(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m792equalsimpl(long j, Object obj) {
        return (obj instanceof t1) && j == ((t1) obj).m796unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m793equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m794hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m795toStringimpl(long j) {
        return "SensorTimestamp(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m792equalsimpl(this.a, obj);
    }

    public final long getValue() {
        return this.a;
    }

    public int hashCode() {
        return m794hashCodeimpl(this.a);
    }

    public String toString() {
        return m795toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m796unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m791constructorimpl(long j) {
        return j;
    }
}
