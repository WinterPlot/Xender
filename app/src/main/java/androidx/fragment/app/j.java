package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                fragment.lambda$performAttach$2();
                break;
            case 1:
                fragment.lambda$restoreViewState$1();
                break;
            case 2:
                fragment.lambda$performPause$14();
                break;
            case 3:
                fragment.lambda$performPause$15();
                break;
            case 4:
                fragment.onPause();
                break;
            case 5:
                fragment.lambda$performDestroy$19();
                break;
            case 6:
                fragment.onDestroy();
                break;
            case 7:
                fragment.onDetach();
                break;
            case 8:
                fragment.onResume();
                break;
            case 9:
                fragment.lambda$performResume$11();
                break;
            case 10:
                fragment.lambda$performResume$12();
                break;
            case 11:
                fragment.lambda$performDestroyView$18();
                break;
            case 12:
                fragment.onDestroyView();
                break;
            case 13:
                fragment.lambda$performCreate$4();
                break;
            case 14:
                fragment.lambda$performCreateView$5();
                break;
            case 15:
                fragment.lambda$performStop$16();
                break;
            case 16:
                fragment.lambda$performStop$17();
                break;
            case 17:
                fragment.onStop();
                break;
            case 18:
                fragment.onStart();
                break;
            case 19:
                fragment.lambda$performStart$9();
                break;
            default:
                fragment.lambda$performStart$10();
                break;
        }
    }
}
