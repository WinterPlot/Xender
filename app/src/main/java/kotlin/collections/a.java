package kotlin.collections;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ kotlin.jvm.internal.markers.a b;

    public /* synthetic */ a(kotlin.jvm.internal.markers.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        kotlin.jvm.internal.markers.a aVar = this.b;
        switch (i) {
            case 0:
                return b.toString$lambda$0((b) aVar, obj);
            default:
                return e.toString$lambda$0((e) aVar, (Map.Entry) obj);
        }
    }
}
