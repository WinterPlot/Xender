package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return d.nullsLast$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
            case 1:
                return d.nullsFirst$lambda$0$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
            default:
                return d.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((l[]) obj3, obj, obj2);
        }
    }
}
