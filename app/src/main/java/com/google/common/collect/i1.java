package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Maps.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.collect.Maps.n
    public final Object transformEntry(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return Maps.lambda$transformValues$1((com.google.common.base.e) obj3, obj, obj2);
            case 1:
                return Maps.lambda$transformValues$2((com.google.common.base.e) obj3, obj, obj2);
            case 2:
                return Maps.lambda$transformValues$0((com.google.common.base.e) obj3, obj, obj2);
            case 3:
                return Multimaps.lambda$transformValues$1((com.google.common.base.e) obj3, obj, obj2);
            case 4:
                return Multimaps.lambda$transformValues$0((com.google.common.base.e) obj3, obj, obj2);
            default:
                return ((Multimaps.e) obj3).transform(obj, (Collection) obj2);
        }
    }
}
