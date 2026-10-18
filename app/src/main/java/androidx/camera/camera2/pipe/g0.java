package androidx.camera.camera2.pipe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private final long a;

    private /* synthetic */ g0(long j) {
        this.a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g0 m408boximpl(long j) {
        return new g0(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m410equalsimpl(long j, Object obj) {
        return (obj instanceof g0) && j == ((g0) obj).m414unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m411equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m412hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m413toStringimpl(long j) {
        return "CameraTimestamp(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m410equalsimpl(this.a, obj);
    }

    public final long getValue() {
        return this.a;
    }

    public int hashCode() {
        return m412hashCodeimpl(this.a);
    }

    public String toString() {
        return m413toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m414unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m409constructorimpl(long j) {
        return j;
    }
}
