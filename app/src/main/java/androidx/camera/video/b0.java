package androidx.camera.video;

import android.util.Size;
import androidx.media3.common.PlaybackException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public static final b0 a;
    public static final b0 b;
    public static final b0 c;
    public static final b0 d;
    public static final b0 e;
    public static final b0 f;
    static final b0 g;
    private static final Set<b0> h;
    private static final List<b0> i;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class b extends b0 {
        public b() {
            super();
        }

        public static b of(int i, int i2, String str, List<Size> list) {
            return new g(i, i2, str, list);
        }

        public abstract int getHighSpeedValue();

        public abstract String getName();

        public int getQualityValue(int i) {
            if (i == 1) {
                return getValue();
            }
            if (i == 2) {
                return getHighSpeedValue();
            }
            okhttp3.b0.o(defpackage.a.j(i, "Unknown quality source: "));
            return 0;
        }

        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        b bVarOf = b.of(4, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, "SD", DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        a = bVarOf;
        b bVarOf2 = b.of(5, PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, "HD", Collections.singletonList(new Size(1280, 720)));
        b = bVarOf2;
        b bVarOf3 = b.of(6, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, "FHD", Collections.singletonList(new Size(1920, 1080)));
        c = bVarOf3;
        b bVarOf4 = b.of(8, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND, "UHD", Collections.singletonList(new Size(3840, 2160)));
        d = bVarOf4;
        List list = Collections.EMPTY_LIST;
        b bVarOf5 = b.of(0, PlaybackException.ERROR_CODE_IO_UNSPECIFIED, "LOWEST", list);
        e = bVarOf5;
        b bVarOf6 = b.of(1, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, "HIGHEST", list);
        f = bVarOf6;
        g = b.of(-1, -1, "NONE", list);
        h = new HashSet(Arrays.asList(bVarOf5, bVarOf6, bVarOf, bVarOf2, bVarOf3, bVarOf4));
        i = Arrays.asList(bVarOf4, bVarOf3, bVarOf2, bVarOf);
    }

    public static boolean containsQuality(b0 b0Var) {
        return h.contains(b0Var);
    }

    public static List<b0> getSortedQualities() {
        return new ArrayList(i);
    }

    private b0() {
    }
}
