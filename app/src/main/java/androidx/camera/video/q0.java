package androidx.camera.video;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Recorder.i.c {
    public final /* synthetic */ Recorder.i a;
    public final /* synthetic */ androidx.camera.video.internal.muxer.e b;
    public final /* synthetic */ y c;
    public final /* synthetic */ ParcelFileDescriptor d;

    public /* synthetic */ q0(Recorder.i iVar, androidx.camera.video.internal.muxer.e eVar, y yVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = iVar;
        this.b = eVar;
        this.c = yVar;
        this.d = parcelFileDescriptor;
    }

    @Override // androidx.camera.video.Recorder.i.c
    public final androidx.camera.video.internal.muxer.d get(int i, androidx.core.util.b bVar) {
        return this.a.lambda$initializeRecording$1(this.b, this.c, this.d, i, bVar);
    }
}
