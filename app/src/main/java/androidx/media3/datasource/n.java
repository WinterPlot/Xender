package androidx.media3.datasource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements com.google.common.base.n {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.n
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return m.c.lambda$entrySet$1((Map.Entry) obj);
            default:
                return m.c.lambda$keySet$0((String) obj);
        }
    }
}
