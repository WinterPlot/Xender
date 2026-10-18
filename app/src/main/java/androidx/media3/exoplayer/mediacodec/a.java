package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.u0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((c) obj2).lambda$useInputBuffer$0((Runnable) obj);
                break;
            default:
                ((MediaCodecRenderer) obj2).lambda$feedInputBuffer$0((u0) obj);
                break;
        }
    }
}
