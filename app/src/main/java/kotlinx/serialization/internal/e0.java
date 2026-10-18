package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i, String str, f0 f0Var) {
        this.b = i;
        this.c = str;
        this.d = f0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return f0.elementDescriptors_delegate$lambda$0(i2, (String) obj2, (f0) obj);
            default:
                return okhttp3.internal.http2.i.pushRequestLater$lambda$1((okhttp3.internal.http2.i) obj2, i2, (List) obj);
        }
    }

    public /* synthetic */ e0(okhttp3.internal.http2.i iVar, int i, List list) {
        this.c = iVar;
        this.b = i;
        this.d = list;
    }
}
