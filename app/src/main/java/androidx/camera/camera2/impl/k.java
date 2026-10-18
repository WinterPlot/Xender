package androidx.camera.camera2.impl;

import android.view.View;
import android.widget.ImageView;
import com.userlabs.xshare.ui.fragment.res.BaseFragment;
import com.userlabs.xshare.videoplayer.common.service.VideoPlayerService;
import com.userlabs.xshare.videoplayer.track.audio.VPAudioTrackSelectDialogFragment;
import com.userlabs.xshare.videoplayer.track.subtitle.VPSubtitleSelectDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((androidx.camera.core.impl.r) obj).onCaptureCancelled(i2);
                break;
            case 1:
                androidx.camera.camera2.pipe.core.c.withAndroidPriority$lambda$0$0(i2, (Runnable) obj);
                break;
            case 2:
                ((androidx.camera.video.internal.audio.m) obj).lambda$updateCollectionBufferSizeAsync$4(i2);
                break;
            case 3:
                ((androidx.core.content.res.h.d) obj).lambda$callbackFailAsync$1(i2);
                break;
            case 4:
                ((androidx.media3.exoplayer.audio.n.a) obj).lambda$audioSessionIdChanged$12(i2);
                break;
            case 5:
                com.userlabs.xshare.h.lambda$checkNetwork$0(i2, (androidx.lifecycle.h0) obj);
                break;
            case 6:
                com.userlabs.xshare.core.provider.a.lambda$insertRemoteAvatar$3((String) obj, i2);
                break;
            case 7:
                com.userlabs.xshare.playlist.db.m.lambda$createPlayList$1((com.userlabs.xshare.playlist.db.m.a) obj, i2);
                break;
            case 8:
                ((BaseFragment) obj).lambda$postSelectCount$1(i2);
                break;
            case 9:
                ((VideoPlayerService) obj).lambda$postListenerOnError$0(i2);
                break;
            case 10:
                ((VPAudioTrackSelectDialogFragment) obj).lambda$scrollToRvSelectedPosition$3(i2);
                break;
            case 11:
                ((VPSubtitleSelectDialogFragment) obj).lambda$scrollToRvSelectedPosition$6(i2);
                break;
            case 12:
                ((ImageView) obj).setImageResource(i2);
                break;
            case 13:
                ((View) obj).setBackgroundResource(i2);
                break;
            case 14:
                ((MaterialButton) obj).lambda$setIconSize$1(i2);
                break;
            case 15:
                ((SideSheetBehavior) obj).lambda$setState$0(i2);
                break;
            default:
                ((TTAppEventLogger) obj).lambda$doStartScheduler$4(i2);
                break;
        }
    }

    public /* synthetic */ k(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
