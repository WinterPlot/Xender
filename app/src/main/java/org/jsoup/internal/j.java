package org.jsoup.internal;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return k.lambda$static$0();
            case 1:
                return m.lambda$new$0();
            default:
                return q.lambda$static$0();
        }
    }
}
