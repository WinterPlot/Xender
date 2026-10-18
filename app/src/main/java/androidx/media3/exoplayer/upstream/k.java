package androidx.media3.exoplayer.upstream;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements androidx.media3.common.util.k {
    @Override // androidx.media3.common.util.k
    public final void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
