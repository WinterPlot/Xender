package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ k(Fragment fragment, Bundle bundle, int i) {
        this.a = i;
        this.b = fragment;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                fragment.lambda$restoreViewState$0(bundle);
                break;
            case 1:
                fragment.lambda$performSaveInstanceState$13(bundle);
                break;
            case 2:
                fragment.lambda$performCreate$3(bundle);
                break;
            case 3:
                fragment.lambda$performActivityCreated$8(bundle);
                break;
            default:
                fragment.lambda$performViewCreated$7(bundle);
                break;
        }
    }
}
