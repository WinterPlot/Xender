package kotlinx.serialization.json;

import java.net.InetAddress;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return u.toString$lambda$0((Map.Entry) obj);
            case 1:
                return okhttp3.q.e.b.toString$lambda$0$0((InetAddress) obj);
            case 2:
                return Boolean.valueOf(okio.internal.j.toJarRoot$lambda$0((okio.internal.l) obj));
            default:
                return Boolean.valueOf(okio.internal.o.openZip$lambda$0((okio.internal.l) obj));
        }
    }
}
