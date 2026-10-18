package org.apache.commons.io;

import java.util.WeakHashMap;
import java.util.function.Supplier;
import org.jsoup.nodes.Entities;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ v(Supplier supplier, int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return w.charArray();
            case 1:
                return w.byteArray();
            case 2:
                return org.jsoup.internal.m.lambda$new$0();
            case 3:
                return Entities.lambda$static$0();
            default:
                return new WeakHashMap();
        }
    }
}
