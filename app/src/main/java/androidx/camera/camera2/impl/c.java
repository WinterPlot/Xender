package androidx.camera.camera2.impl;

import android.os.Build;
import android.util.Log;
import androidx.camera.core.n1;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a;
    private static final String b;

    static {
        c cVar = new c();
        a = cVar;
        b = cVar.truncateTag("CXCP");
    }

    private c() {
    }

    private final String truncateTag(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public final void debug(Throwable th, kotlin.jvm.functions.a<String> aVar) {
        th.getClass();
        aVar.getClass();
        if (n1.isDebugEnabled("CXCP")) {
            Log.d(b, aVar.invoke(), th);
        }
    }

    public final void error(Throwable th, kotlin.jvm.functions.a<String> aVar) {
        th.getClass();
        aVar.getClass();
        if (n1.isErrorEnabled("CXCP")) {
            Log.e(b, aVar.invoke(), th);
        }
    }

    public final void info(Throwable th, kotlin.jvm.functions.a<String> aVar) {
        th.getClass();
        aVar.getClass();
        if (n1.isInfoEnabled("CXCP")) {
            Log.i(b, aVar.invoke(), th);
        }
    }

    public final void verbose(Throwable th, kotlin.jvm.functions.a<String> aVar) {
        th.getClass();
        aVar.getClass();
        if (n1.isVerboseEnabled("CXCP")) {
            Log.v(b, aVar.invoke(), th);
        }
    }

    public final void warn(Throwable th, kotlin.jvm.functions.a<String> aVar) {
        th.getClass();
        aVar.getClass();
        if (n1.isWarnEnabled("CXCP")) {
            Log.w(b, aVar.invoke(), th);
        }
    }

    public final void debug(kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (n1.isDebugEnabled("CXCP")) {
            Log.d(b, aVar.invoke());
        }
    }

    public final void error(kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (n1.isErrorEnabled("CXCP")) {
            Log.e(b, aVar.invoke());
        }
    }

    public final void info(kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (n1.isInfoEnabled("CXCP")) {
            Log.i(b, aVar.invoke());
        }
    }

    public final void verbose(kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (n1.isVerboseEnabled("CXCP")) {
            Log.v(b, aVar.invoke());
        }
    }

    public final void warn(kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (n1.isWarnEnabled("CXCP")) {
            Log.w(b, aVar.invoke());
        }
    }
}
