package androidx.media3.session;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j5 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((k5) obj2).scaleIfNecessary((Bitmap) obj);
            case 1:
                return ((MediaSessionService) obj2).lambda$onUpdateNotification$3((RuntimeException) obj);
            default:
                return ((l5) obj2).scaleIfNecessary((Bitmap) obj);
        }
    }
}
