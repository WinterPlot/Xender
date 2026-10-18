package kotlinx.serialization;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ m(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return n.PARAMETRIZED_SERIALIZERS_CACHE$lambda$0$0(list);
            default:
                return n.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$0$0(list);
        }
    }
}
