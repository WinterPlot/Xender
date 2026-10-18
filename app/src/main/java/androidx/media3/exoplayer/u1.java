package androidx.media3.exoplayer;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface u1 {
    q1[] createRenderers(Handler handler, androidx.media3.exoplayer.video.v vVar, androidx.media3.exoplayer.audio.n nVar, androidx.media3.exoplayer.text.g gVar, androidx.media3.exoplayer.metadata.b bVar);

    q1 createSecondaryRenderer(q1 q1Var, Handler handler, androidx.media3.exoplayer.video.v vVar, androidx.media3.exoplayer.audio.n nVar, androidx.media3.exoplayer.text.g gVar, androidx.media3.exoplayer.metadata.b bVar);
}
