package com.userlabs.xshare.videoplayer.exo;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                ((ExoVideoPlayerActivity2) callback).lambda$onLockStateChanged$6();
                break;
            case 1:
                ((ExoVideoPlayerActivity2) callback).lambda$initializeMediaController$4();
                break;
            case 2:
                ((ExoVideoPlayerActivity2) callback).lambda$changeSubtitleViewColor$7();
                break;
            case 3:
                ((ExoVideoPlayerActivity2) callback).lambda$addWindowInsetsListener$3();
                break;
            default:
                ((VideoProcessingGLSurfaceView) callback).lambda$onDetachedFromWindow$0();
                break;
        }
    }
}
