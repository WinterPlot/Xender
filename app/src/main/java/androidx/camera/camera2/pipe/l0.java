package androidx.camera.camera2.pipe;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final a b = new a(null);
    private static final int c = m696constructorimpl(0);
    private static final int d = m696constructorimpl(1);
    private static final int e = m696constructorimpl(2);
    private final int a;

    private /* synthetic */ l0(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l0 m695boximpl(int i) {
        return new l0(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m697equalsimpl(int i, Object obj) {
        return (obj instanceof l0) && i == ((l0) obj).m701unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m698equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m700toStringimpl(int i) {
        if (m698equalsimpl0(i, d)) {
            return "SUPPORTED";
        }
        return m698equalsimpl0(i, e) ? "UNSUPPORTED" : "UNKNOWN";
    }

    public boolean equals(Object obj) {
        return m697equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m699hashCodeimpl(this.a);
    }

    public String toString() {
        return m700toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m701unboximpl() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        /* JADX INFO: renamed from: getSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m702getSUPPORTEDXp6DSB4() {
            return l0.d;
        }

        /* JADX INFO: renamed from: getUNKNOWN-Xp6DSB4, reason: not valid java name */
        public final int m703getUNKNOWNXp6DSB4() {
            return l0.c;
        }

        /* JADX INFO: renamed from: getUNSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m704getUNSUPPORTEDXp6DSB4() {
            return l0.e;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m696constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m699hashCodeimpl(int i) {
        return i;
    }
}
