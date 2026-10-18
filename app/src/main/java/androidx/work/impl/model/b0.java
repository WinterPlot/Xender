package androidx.work.impl.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ f0 d;

    public /* synthetic */ b0(String str, List list, f0 f0Var, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = f0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        f0 f0Var = this.d;
        List list = this.c;
        String str = this.b;
        androidx.sqlite.b bVar = (androidx.sqlite.b) obj;
        switch (i) {
            case 0:
                return f0.getWorkStatusPojoFlowDataForIds$lambda$11(str, list, f0Var, bVar);
            case 1:
                return f0.getWorkStatusPojoLiveDataForIds$lambda$10(str, list, f0Var, bVar);
            default:
                return f0.getWorkStatusPojoForIds$lambda$9(str, list, f0Var, bVar);
        }
    }
}
