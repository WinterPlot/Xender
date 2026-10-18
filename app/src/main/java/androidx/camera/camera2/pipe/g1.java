package androidx.camera.camera2.pipe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    private final int a;

    private /* synthetic */ g1(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g1 m415boximpl(int i) {
        return new g1(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m417equalsimpl(int i, Object obj) {
        return (obj instanceof g1) && i == ((g1) obj).m421unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m418equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m420toStringimpl(int i) {
        return defpackage.a.j(i, "Output-");
    }

    public boolean equals(Object obj) {
        return m417equalsimpl(this.a, obj);
    }

    public final int getValue() {
        return this.a;
    }

    public int hashCode() {
        return m419hashCodeimpl(this.a);
    }

    public String toString() {
        return m420toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m421unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m416constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m419hashCodeimpl(int i) {
        return i;
    }
}
