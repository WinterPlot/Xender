package androidx.camera.video.internal.audio;

import android.view.View;
import com.userlabs.xshare.utils.d0;
import com.google.android.material.internal.z;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AudioStream.a) obj).onSilenceStateChanged(z);
                break;
            case 1:
                ((androidx.media3.exoplayer.audio.n.a) obj).lambda$skipSilenceEnabledChanged$7(z);
                break;
            case 2:
                ((com.userlabs.xshare.core.pc.client.g) obj).lambda$initWebServer$2(z);
                break;
            case 3:
                ((com.userlabs.xshare.dbwriter.history.c) obj).lambda$doWork$0(z);
                break;
            case 4:
                ((com.userlabs.xshare.service.b.InterfaceC0357b) obj).onResult(z);
                break;
            case 5:
                ((d0) obj).lambda$setCancelableDelay$0(z);
                break;
            default:
                z.showKeyboard((View) obj, z);
                break;
        }
    }
}
