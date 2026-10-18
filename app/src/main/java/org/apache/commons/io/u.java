package org.apache.commons.io;

import java.util.function.Supplier;
import org.jsoup.nodes.Entities;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return w.getScratchByteArrayWriteOnly();
            case 1:
                return w.byteArray();
            case 2:
                return w.charArray();
            case 3:
                return org.apache.commons.io.charset.b.lambda$toCharsetEncoder$0();
            default:
                return Entities.lambda$static$0();
        }
    }
}
