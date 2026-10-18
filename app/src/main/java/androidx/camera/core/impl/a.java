package androidx.camera.core.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Serializable serializable, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                b.lambda$notifyObserver$0((Throwable) serializable, (b.a) obj2, (List) obj);
                break;
            default:
                p0.clearAllCameraStateObservers$lambda$2$0((ArrayList) serializable, (androidx.lifecycle.i0) obj2, (String) obj);
                break;
        }
    }
}
