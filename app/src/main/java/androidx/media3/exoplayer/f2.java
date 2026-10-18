package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface f2 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onSelectedOutputSuitabilityChanged(boolean z);
    }

    void disable();

    void enable(a aVar, Context context, Looper looper, Looper looper2, androidx.media3.common.util.g gVar);

    boolean isSelectedOutputSuitableForPlayback();
}
