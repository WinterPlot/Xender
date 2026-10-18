package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return x.getIndentFunction$lambda$0$StringsKt__IndentKt((String) obj);
            case 1:
                return l0.windowed$lambda$0$StringsKt___StringsKt((CharSequence) obj);
            case 2:
                return l0.windowedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
            default:
                return l0.chunkedSequence$lambda$0$StringsKt___StringsKt((CharSequence) obj);
        }
    }
}
