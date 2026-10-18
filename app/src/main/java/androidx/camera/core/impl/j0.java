package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0.b b;
    public final /* synthetic */ Set c;

    public /* synthetic */ j0(p0.b bVar, Set set, int i) {
        this.a = i;
        this.b = bVar;
        this.c = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Set set = this.c;
        p0.b bVar = this.b;
        switch (i) {
            case 0:
                p0.notifyPublicCamerasRemoved$lambda$0$0(bVar, set);
                break;
            default:
                p0.notifyPublicCamerasAdded$lambda$0$0(bVar, set);
                break;
        }
    }
}
