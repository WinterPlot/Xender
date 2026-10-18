package androidx.camera.video;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements androidx.core.util.b {
    public final /* synthetic */ int a;

    public /* synthetic */ p0(int i) {
        this.a = i;
    }

    @Override // androidx.core.util.b
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Recorder.i.lambda$new$0((Uri) obj);
                break;
            default:
                Recorder.lambda$composeRecorderMediaSpec$10((h1.a) obj);
                break;
        }
    }
}
