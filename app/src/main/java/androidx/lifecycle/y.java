package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ x c;

    public /* synthetic */ y(z zVar, x xVar, int i) {
        this.a = i;
        this.b = zVar;
        this.c = xVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        x xVar = this.c;
        z zVar = this.b;
        Map.Entry entry = (Map.Entry) obj;
        switch (i) {
            case 0:
                return z.backwardPass$lambda$0(zVar, xVar, entry);
            default:
                return z.forwardPass$lambda$0(zVar, xVar, entry);
        }
    }
}
