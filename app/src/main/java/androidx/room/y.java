package androidx.room;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ kotlin.jvm.functions.l b;

    public /* synthetic */ y(int i, kotlin.jvm.functions.l lVar) {
        this.a = i;
        this.b = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        kotlin.jvm.functions.l lVar = this.b;
        switch (i) {
            case 0:
                return z.bindingFunction$lambda$1(lVar, (androidx.sqlite.d) obj);
            default:
                return kotlinx.coroutines.internal.l.safeCtor$lambda$9(lVar, (Throwable) obj);
        }
    }
}
