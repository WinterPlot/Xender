package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0 c = new e0("");
    public static final e0 d = new e0("preload");
    public final String a;
    private final a b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public LogSessionId a = LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(LogSessionId logSessionId) {
            com.google.common.base.m.checkState(this.a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.a = logSessionId;
        }
    }

    public e0(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
    }

    public synchronized LogSessionId getLogSessionId() {
        return ((a) com.google.common.base.m.checkNotNull(this.b)).a;
    }

    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        ((a) com.google.common.base.m.checkNotNull(this.b)).setLogSessionId(logSessionId);
    }
}
