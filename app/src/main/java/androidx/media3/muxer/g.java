package androidx.media3.muxer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements h {
    @Override // androidx.media3.muxer.h
    public final ByteBuffer allocate(int i) {
        return ByteBuffer.allocateDirect(i);
    }
}
