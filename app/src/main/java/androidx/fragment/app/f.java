package androidx.fragment.app;

import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h0.setViewVisibility((ArrayList) obj, 4);
                break;
            case 1:
                d.g.onStart$lambda$3$0$2((d.g) obj);
                break;
            case 2:
                d.g.onStart$lambda$2$0((Ref$ObjectRef) obj);
                break;
            default:
                ((FragmentManager) obj).lambda$cancelBackStackTransition$4();
                break;
        }
    }
}
