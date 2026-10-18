package com.userlabs.xshare.ui.fragment.splash;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SplashFragment b;

    public /* synthetic */ b(SplashFragment splashFragment, int i) {
        this.a = i;
        this.b = splashFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SplashFragment splashFragment = this.b;
        switch (i) {
            case 0:
                splashFragment.lambda$new$6();
                break;
            case 1:
                splashFragment.lambda$onViewCreated$2();
                break;
            default:
                splashFragment.lambda$onViewCreated$4();
                break;
        }
    }
}
