package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.e2;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(EncoderImpl.e eVar, Executor executor, k kVar) {
        this.a = 1;
        this.c = eVar;
        this.b = executor;
        this.d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((EncoderImpl.d) obj3).lambda$addObserver$7((e2.a) obj2, (Executor) obj);
                break;
            case 1:
                ((EncoderImpl.e) obj3).lambda$reachEndData$2((Executor) obj, (k) obj2);
                break;
            default:
                ((EncoderImpl) obj3).lambda$stopMediaCodec$12((ArrayList) obj2, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ r(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
