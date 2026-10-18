package androidx.camera.camera2.pipe;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public static final a b = new a(null);
    private static final int c = m384constructorimpl(1);
    private static final int d = m384constructorimpl(2);
    private static final int e = m384constructorimpl(3);
    private final int a;

    private /* synthetic */ d1(int i) {
        this.a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ d1 m383boximpl(int i) {
        return new d1(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m385equalsimpl(int i, Object obj) {
        return (obj instanceof d1) && i == ((d1) obj).m389unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m386equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m388toStringimpl(int i) {
        return defpackage.a.m("Lock3ABehavior(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m385equalsimpl(this.a, obj);
    }

    public final int getValue() {
        return this.a;
    }

    public int hashCode() {
        return m387hashCodeimpl(this.a);
    }

    public String toString() {
        return m388toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m389unboximpl() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        /* JADX INFO: renamed from: getAFTER_CURRENT_SCAN-hRqSH3k, reason: not valid java name */
        public final int m390getAFTER_CURRENT_SCANhRqSH3k() {
            return d1.d;
        }

        /* JADX INFO: renamed from: getAFTER_NEW_SCAN-hRqSH3k, reason: not valid java name */
        public final int m391getAFTER_NEW_SCANhRqSH3k() {
            return d1.e;
        }

        /* JADX INFO: renamed from: getIMMEDIATE-hRqSH3k, reason: not valid java name */
        public final int m392getIMMEDIATEhRqSH3k() {
            return d1.c;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m384constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m387hashCodeimpl(int i) {
        return i;
    }
}
