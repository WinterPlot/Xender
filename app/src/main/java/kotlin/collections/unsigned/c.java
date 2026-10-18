package kotlin.collections.unsigned;

import kotlin.q;
import kotlin.s;
import kotlin.u;
import kotlin.x;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return s.m2138iteratorimpl((int[]) obj);
            case 1:
                return u.m2360iteratorimpl((long[]) obj);
            case 2:
                return q.m2003iteratorimpl((byte[]) obj);
            default:
                return x.m2439iteratorimpl((short[]) obj);
        }
    }
}
