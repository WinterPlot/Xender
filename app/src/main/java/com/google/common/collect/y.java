package com.google.common.collect;

import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ IntFunction c;

    public /* synthetic */ y(Consumer consumer, IntFunction intFunction, int i) {
        this.a = i;
        this.b = consumer;
        this.c = intFunction;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                x.c.lambda$forEachRemaining$0(this.b, this.c, i);
                break;
            default:
                x.c.lambda$tryAdvance$0(this.b, this.c, i);
                break;
        }
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        int i = this.a;
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
