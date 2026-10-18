package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return x.prependIndent$lambda$0$StringsKt__IndentKt((String) obj2, (String) obj);
            case 1:
                return x.getIndentFunction$lambda$1$StringsKt__IndentKt((String) obj2, (String) obj);
            default:
                return ((q.b) obj2).get(((Integer) obj).intValue());
        }
    }
}
