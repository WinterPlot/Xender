package com.google.common.collect;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ Function c;

    public /* synthetic */ w(Consumer consumer, Function function, int i) {
        this.a = i;
        this.b = consumer;
        this.c = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                x.a.lambda$forEachRemaining$0(this.b, this.c, obj);
                break;
            default:
                x.a.lambda$tryAdvance$0(this.b, this.c, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
