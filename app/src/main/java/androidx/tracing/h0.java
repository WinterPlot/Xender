package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    public static final h0 a = new h0();
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static boolean g;

    private h0() {
    }

    public static final void beginAsyncSection(String str, int i) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.beginAsyncSection(a.truncatedTraceSectionLabel(str), i);
        } else {
            h0 h0Var = a;
            h0Var.beginAsyncSectionFallback(h0Var.truncatedTraceSectionLabel(str), i);
        }
    }

    private final void beginAsyncSectionFallback(String str, int i) throws Throwable {
        try {
            Method method = d;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                d = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            handleException("asyncTraceBegin", e2);
        }
    }

    public static final void beginSection(String str) {
        Trace.beginSection(a.truncatedTraceSectionLabel(str));
    }

    public static final void endAsyncSection(String str, int i) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.endAsyncSection(a.truncatedTraceSectionLabel(str), i);
        } else {
            h0 h0Var = a;
            h0Var.endAsyncSectionFallback(h0Var.truncatedTraceSectionLabel(str), i);
        }
    }

    private final void endAsyncSectionFallback(String str, int i) throws Throwable {
        try {
            Method method = e;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                e = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            handleException("asyncTraceEnd", e2);
        }
    }

    public static final void endSection() {
        Trace.endSection();
    }

    public static final void forceEnableAppTracing() throws Throwable {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (g) {
                    return;
                }
                g = true;
                Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Exception e2) {
                a.handleException("setAppTracingAllowed", e2);
            }
        }
    }

    private final void handleException(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            com.google.gson.internal.a.p(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean isEnabled() {
        return Build.VERSION.SDK_INT >= 29 ? i0.a.isEnabled() : a.isEnabledFallback();
    }

    private final boolean isEnabledFallback() throws Throwable {
        try {
            Method method = c;
            if (method == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                c = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(b));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            handleException("isTagEnabled", e2);
            return false;
        }
    }

    public static final void setCounter(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.setCounter(a.truncatedTraceSectionLabel(str), i);
        } else {
            h0 h0Var = a;
            h0Var.setCounterFallback(h0Var.truncatedTraceSectionLabel(str), i);
        }
    }

    private final void setCounterFallback(String str, int i) throws Throwable {
        try {
            Method method = f;
            if (method == null) {
                method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                f = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            handleException("traceCounter", e2);
        }
    }

    private final String truncatedTraceSectionLabel(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    private static /* synthetic */ void isEnabledFallback$annotations() {
    }

    public static final void setCounter(String str, long j) {
        i0.a.setCounter(a.truncatedTraceSectionLabel(str), j);
    }
}
