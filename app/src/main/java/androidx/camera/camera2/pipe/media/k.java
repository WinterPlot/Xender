package androidx.camera.camera2.pipe.media;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements m.a {
    public final /* synthetic */ ImageReaderImageSource a;

    public /* synthetic */ k(ImageReaderImageSource imageReaderImageSource) {
        this.a = imageReaderImageSource;
    }

    @Override // androidx.camera.camera2.pipe.media.m.a
    public final void onExpectedOutputs(long j, Set set) {
        ImageReaderImageSource._init_$lambda$0(this.a, j, set);
    }
}
