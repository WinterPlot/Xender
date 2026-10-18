package androidx.media3.exoplayer.audio;

import com.userlabs.xshare.audioplayer.lyrics.view.XSyncedLyricsView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(long j, androidx.lifecycle.h0 h0Var) {
        this.a = 3;
        this.b = j;
        this.c = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((n.a) obj).lambda$positionAdvancing$3(j);
                break;
            case 1:
                ((XSyncedLyricsView) obj).lambda$updateTime$0(j);
                break;
            case 2:
                com.userlabs.xshare.playlist.db.m.lambda$insertAll$9((com.userlabs.xshare.playlist.db.m.b) obj, j);
                break;
            case 3:
                com.userlabs.xshare.ui.fragment.pc.state.a.lambda$loadHotspotConnectStatus$0(j, (androidx.lifecycle.h0) obj);
                break;
            default:
                com.userlabs.xshare.vdlist.k.lambda$newVideo$5((String) obj, j);
                break;
        }
    }

    public /* synthetic */ j(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
