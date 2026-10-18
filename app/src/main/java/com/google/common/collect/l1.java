package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l1 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((Multimaps.e) obj2).lambda$createValues$0((Map.Entry) obj);
            case 1:
                return Maps.transformEntry((Maps.n) obj2, (Map.Entry) obj);
            default:
                return ((j1) obj2).get(obj);
        }
    }
}
