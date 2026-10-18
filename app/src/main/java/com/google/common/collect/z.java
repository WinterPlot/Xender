package com.google.common.collect;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ x.d b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(x.d dVar, Object obj, int i) {
        this.a = i;
        this.b = dVar;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        x.d dVar = this.b;
        switch (i) {
            case 0:
                dVar.lambda$forEachRemaining$0((Consumer) obj2, obj);
                break;
            default:
                ((x.i) dVar).lambda$forEachRemaining$0(obj2, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
