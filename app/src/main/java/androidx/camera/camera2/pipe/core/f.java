package androidx.camera.camera2.pipe.core;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final a b = new a(null);
    private final long a;

    private /* synthetic */ f(long j) {
        this.a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m332boximpl(long j) {
        return new f(j);
    }

    /* JADX INFO: renamed from: compareTo-zYRVrok, reason: not valid java name */
    public static final int m333compareTozYRVrok(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m335equalsimpl(long j, Object obj) {
        return (obj instanceof f) && j == ((f) obj).m342unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m336equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m337hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: minus-AUCehY4, reason: not valid java name */
    public static final long m338minusAUCehY4(long j, long j2) {
        return m334constructorimpl(j - j2);
    }

    /* JADX INFO: renamed from: plus-AUCehY4, reason: not valid java name */
    public static final long m339plusAUCehY4(long j, long j2) {
        return m334constructorimpl(j + j2);
    }

    /* JADX INFO: renamed from: plus-OxkKeMI, reason: not valid java name */
    public static final long m340plusOxkKeMI(long j, long j2) {
        return o.m346constructorimpl(j + j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m341toStringimpl(long j) {
        return "DurationNs(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m335equalsimpl(this.a, obj);
    }

    public final long getValue() {
        return this.a;
    }

    public int hashCode() {
        return m337hashCodeimpl(this.a);
    }

    public String toString() {
        return m341toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m342unboximpl() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        /* JADX INFO: renamed from: fromMs-wRu4V9A, reason: not valid java name */
        public final long m343fromMswRu4V9A(long j) {
            return f.m334constructorimpl(j * 1000000);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m334constructorimpl(long j) {
        return j;
    }
}
