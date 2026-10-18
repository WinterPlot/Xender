package org.apache.commons.io;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ r(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return IOCase.lambda$forName$1(str);
            default:
                return org.jsoup.internal.q.lambda$joining$1(str);
        }
    }
}
