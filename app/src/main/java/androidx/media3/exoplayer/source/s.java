package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final AtomicLong h = new AtomicLong();
    public final long a;
    public final androidx.media3.datasource.k b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public s(long j, androidx.media3.datasource.k kVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.a = j;
        this.b = kVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }

    public static long getNewId() {
        return h.getAndIncrement();
    }

    public s copyWithTaskIdAndDurationMs(long j, long j2) {
        return new s(j, this.b, this.c, this.d, this.e, j2, this.g);
    }

    public s(long j, androidx.media3.datasource.k kVar, long j2) {
        this(j, kVar, kVar.a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }
}
