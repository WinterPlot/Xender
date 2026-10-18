package androidx.camera.camera2.pipe.core;

import okhttp3.u;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ kotlin.jvm.functions.a b;

    public /* synthetic */ m(int i, kotlin.jvm.functions.a aVar) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        kotlin.jvm.functions.a aVar = this.b;
        switch (i) {
            case 0:
                return Threads._camera2Handler$lambda$0(aVar);
            case 1:
                return Threads._camera2Executor$lambda$0(aVar);
            case 2:
                return androidx.navigation.internal.i.pop$lambda$6(aVar);
            default:
                return u.peerCertificates_delegate$lambda$0(aVar);
        }
    }
}
