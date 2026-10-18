package com.google.common.collect;

import j$.util.function.Consumer$CC;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((x.d) obj2).lambda$tryAdvance$0(obj);
                break;
            case 1:
                ((x.i) obj2).lambda$tryAdvance$0(obj);
                break;
            case 2:
                h2.lambda$forEachPair$0((BiConsumer) obj2, (h2.p) obj);
                break;
            case 3:
                ((h2.b) obj2).set(obj);
                break;
            default:
                ((Collection) obj2).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
