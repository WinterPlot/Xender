package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements com.google.common.base.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.n
    public final boolean apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return g0.c.a.lambda$removeEntriesIf$0((com.google.common.base.n) obj2, (Map.Entry) obj);
            case 1:
                return Maps.o.lambda$inversePredicate$0((com.google.common.base.n) obj2, (Map.Entry) obj);
            default:
                return ((Multisets.j) obj2).lambda$createEntrySet$0((n1.a) obj);
        }
    }
}
