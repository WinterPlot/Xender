package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.s1;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements s1.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ p(s sVar, int i) {
        this.a = i;
        this.b = sVar;
    }

    @Override // androidx.camera.core.impl.s1.a
    public final void onImageAvailable(s1 s1Var) {
        int i = this.a;
        s sVar = this.b;
        switch (i) {
            case 0:
                sVar.lambda$transform$1(s1Var);
                break;
            default:
                sVar.lambda$setOnImageAvailableListener$2(s1Var);
                break;
        }
    }
}
