package org.jsoup.safety;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo1080andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return c.lambda$addAttributes$0((c.d) obj);
            case 1:
                return c.lambda$addProtocols$2((c.d) obj);
            case 2:
                return c.lambda$addProtocols$3((c.a) obj);
            default:
                return c.lambda$addEnforcedAttribute$1((c.d) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
