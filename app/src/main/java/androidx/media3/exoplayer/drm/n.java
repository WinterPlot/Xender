package androidx.media3.exoplayer.drm;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements androidx.media3.decoder.b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;

    @Deprecated
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        d = z;
    }

    @Deprecated
    public n(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }

    public n(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }
}
