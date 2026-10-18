package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k1 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Multimaps.e c;

    public /* synthetic */ k1(Multimaps.e eVar, Object obj, int i) {
        this.a = i;
        this.c = eVar;
        this.b = obj;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Multimaps.e eVar = this.c;
        switch (i) {
            case 0:
                return ((Multimaps.d) eVar).lambda$transform$0(obj2, obj);
            default:
                return eVar.lambda$transform$0(obj2, obj);
        }
    }
}
