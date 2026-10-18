package androidx.work.impl.utils;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public static final a b = new a(null);
    private static final String c;
    private final Object a;

    static {
        String strTagWithPrefix = androidx.work.p.tagWithPrefix("NetworkRequestCompat");
        strTagWithPrefix.getClass();
        c = strTagWithPrefix;
    }

    public /* synthetic */ q(Object obj, int i, kotlin.jvm.internal.r rVar) {
        this((i & 1) != 0 ? null : obj);
    }

    public static /* synthetic */ q copy$default(q qVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = qVar.a;
        }
        return qVar.copy(obj);
    }

    public final Object component1() {
        return this.a;
    }

    public final q copy(Object obj) {
        return new q(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.y.areEqual(this.a, ((q) obj).a);
    }

    public final NetworkRequest getNetworkRequest() {
        return (NetworkRequest) this.a;
    }

    public final Object getWrapped() {
        return this.a;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
            this();
        }

        public final String getTAG() {
            return q.c;
        }

        private a() {
        }
    }

    public q(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q() {
        this((kotlin.jvm.internal.r) null, 1, (kotlin.jvm.internal.r) null);
    }
}
