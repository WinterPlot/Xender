package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q2 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ kotlinx.serialization.a c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2(r2 r2Var, kotlinx.serialization.a aVar, Object obj, int i) {
        this.a = i;
        this.b = r2Var;
        this.c = aVar;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        kotlinx.serialization.a aVar = this.c;
        r2 r2Var = this.b;
        switch (i) {
            case 0:
                return r2Var.decodeSerializableValue(aVar, obj);
            default:
                return r2.decodeNullableSerializableElement$lambda$0(r2Var, aVar, obj);
        }
    }
}
