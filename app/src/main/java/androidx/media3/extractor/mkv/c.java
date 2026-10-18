package androidx.media3.extractor.mkv;

import androidx.media3.extractor.p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
interface c {
    void init(b bVar);

    boolean read(p pVar) throws IOException;

    void reset();
}
