package androidx.camera.video;

import android.content.Context;
import android.net.Uri;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements androidx.core.util.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.core.util.b
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Recorder.i.lambda$initializeRecording$4((v) obj3, (Context) obj2, (Uri) obj);
                break;
            default:
                ((Recorder) obj3).lambda$updateEncoderCallbacks$13((CallbackToFutureAdapter.a) obj2, (Throwable) obj);
                break;
        }
    }
}
