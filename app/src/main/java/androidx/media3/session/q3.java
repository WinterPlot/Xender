package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ q3(u3 u3Var, int i) {
        this.a = i;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        u3 u3Var = this.b;
        switch (i) {
            case 0:
                u3Var.updateCustomLayoutAndLegacyExtrasForMediaButtonPreferencesAndInformExtrasChanged();
                break;
            default:
                u3Var.onAndroidAutoConnectionStateChanged();
                break;
        }
    }
}
