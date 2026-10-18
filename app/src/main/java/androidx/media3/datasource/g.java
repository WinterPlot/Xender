package androidx.media3.datasource;

import android.net.Uri;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((h) obj2).lambda$decodeBitmap$1((byte[]) obj);
            case 1:
                return ((h) obj2).lambda$loadBitmap$2((Uri) obj);
            default:
                return ((com.userlabs.xshare.videoplayer.f) obj2).lambda$playTarget$3((com.userlabs.xshare.videoplayer.f.n) obj);
        }
    }
}
