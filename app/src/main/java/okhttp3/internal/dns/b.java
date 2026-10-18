package okhttp3.internal.dns;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zEnqueue$lambda$0;
        c.a aVar = (c.a) obj;
        switch (this.a) {
            case 0:
                zEnqueue$lambda$0 = c.enqueue$lambda$0(aVar);
                break;
            case 1:
                zEnqueue$lambda$0 = c.runOnce$lambda$0(aVar);
                break;
            case 2:
                zEnqueue$lambda$0 = c.runOnce$lambda$2(aVar);
                break;
            default:
                zEnqueue$lambda$0 = c.cancel$lambda$0(aVar);
                break;
        }
        return Boolean.valueOf(zEnqueue$lambda$0);
    }
}
