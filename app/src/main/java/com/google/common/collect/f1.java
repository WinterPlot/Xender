package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ f1(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Iterators.m.lambda$new$0(this.b, (Iterators.m.a) obj, (Iterators.m.a) obj2);
            default:
                return ImmutableSortedMap.lambda$fromEntries$0(this.b, (Map.Entry) obj, (Map.Entry) obj2);
        }
    }
}
