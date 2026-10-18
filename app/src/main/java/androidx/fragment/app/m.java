package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements androidx.savedstate.g.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.g.b
    public final Bundle saveState() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((FragmentActivity) obj).lambda$init$0();
            default:
                return ((FragmentManager) obj).lambda$attachController$5();
        }
    }
}
