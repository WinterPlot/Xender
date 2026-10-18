package kotlin.sequences;

import kotlin.collections.m0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SequencesKt__SequencesKt.flatten$lambda$0$SequencesKt__SequencesKt((m) obj);
            case 1:
                return SequencesKt__SequencesKt.flatten$lambda$1$SequencesKt__SequencesKt((Iterable) obj);
            case 2:
                return SequencesKt__SequencesKt.flatten$lambda$2$SequencesKt__SequencesKt(obj);
            case 3:
                return SequencesKt___SequencesKt.filterIndexed$lambda$1$SequencesKt___SequencesKt((m0) obj);
            case 4:
                return Boolean.valueOf(SequencesKt___SequencesKt.filterNotNull$lambda$0$SequencesKt___SequencesKt(obj));
            default:
                return SequencesKt___SequencesKt.distinct$lambda$0$SequencesKt___SequencesKt(obj);
        }
    }
}
