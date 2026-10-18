package androidx.paging;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    private final boolean a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a extends r {
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false, null);
            th.getClass();
            this.b = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return getEndOfPaginationReached() == aVar.getEndOfPaginationReached() && kotlin.jvm.internal.y.areEqual(this.b, aVar.b);
        }

        public final Throwable getError() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + (getEndOfPaginationReached() ? 1231 : 1237);
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends r {
        public static final b b = new b();

        private b() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && getEndOfPaginationReached() == ((b) obj).getEndOfPaginationReached();
        }

        public int hashCode() {
            return getEndOfPaginationReached() ? 1231 : 1237;
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    private r(boolean z) {
        this.a = z;
    }

    public final boolean getEndOfPaginationReached() {
        return this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends r {
        public static final a b = new a(null);
        private static final c c = new c(true);
        private static final c d = new c(false);

        public c(boolean z) {
            super(z, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && getEndOfPaginationReached() == ((c) obj).getEndOfPaginationReached();
        }

        public int hashCode() {
            return getEndOfPaginationReached() ? 1231 : 1237;
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
                this();
            }

            public final c getComplete$paging_common() {
                return c.c;
            }

            public final c getIncomplete$paging_common() {
                return c.d;
            }

            private a() {
            }
        }
    }

    public /* synthetic */ r(boolean z, kotlin.jvm.internal.r rVar) {
        this(z);
    }
}
