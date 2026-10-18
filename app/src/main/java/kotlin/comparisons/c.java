package kotlin.comparisons;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Comparator c;

    public /* synthetic */ c(Comparator comparator, Comparator comparator2, int i) {
        this.a = i;
        this.b = comparator;
        this.c = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return d.thenDescending$lambda$0$ComparisonsKt__ComparisonsKt(this.b, this.c, obj, obj2);
            default:
                return d.then$lambda$0$ComparisonsKt__ComparisonsKt(this.b, this.c, obj, obj2);
        }
    }
}
