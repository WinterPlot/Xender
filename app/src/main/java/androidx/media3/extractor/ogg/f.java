package androidx.media3.extractor.ogg;

import androidx.media3.extractor.j0;
import androidx.media3.extractor.p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
interface f {
    j0 createSeekMap();

    long read(p pVar) throws IOException;

    void startSeek(long j);
}
