package androidx.fragment.app;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d.g b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ e(d.g gVar, ViewGroup viewGroup, Object obj) {
        this.b = gVar;
        this.d = viewGroup;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        ViewGroup viewGroup = this.d;
        Object obj = this.c;
        d.g gVar = this.b;
        switch (i) {
            case 0:
                return d.g.onCommit$lambda$3(gVar, viewGroup, obj);
            default:
                return d.g.onStart$lambda$3$0(gVar, obj, viewGroup);
        }
    }

    public /* synthetic */ e(d.g gVar, Object obj, ViewGroup viewGroup) {
        this.b = gVar;
        this.c = obj;
        this.d = viewGroup;
    }
}
