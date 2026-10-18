package kotlin.collections;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return kotlin.jvm.internal.h.iterator((Object[]) obj);
            case 1:
                return kotlin.jvm.internal.i.iterator((int[]) obj);
            case 2:
                return kotlin.jvm.internal.i.iterator((double[]) obj);
            case 3:
                return kotlin.jvm.internal.i.iterator((char[]) obj);
            case 4:
                return kotlin.jvm.internal.i.iterator((short[]) obj);
            case 5:
                return kotlin.jvm.internal.i.iterator((float[]) obj);
            case 6:
                return kotlin.jvm.internal.i.iterator((boolean[]) obj);
            case 7:
                return kotlin.jvm.internal.i.iterator((long[]) obj);
            case 8:
                return kotlin.jvm.internal.i.iterator((byte[]) obj);
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
