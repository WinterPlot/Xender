package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static void addSuppressed(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            kotlin.internal.b.a.addSuppressed(th, th2);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        return stackTrace;
    }

    public static final List<Throwable> getSuppressedExceptions(Throwable th) {
        th.getClass();
        return kotlin.internal.b.a.getSuppressed(th);
    }

    private static final void printStackTrace(Throwable th, PrintWriter printWriter) {
        th.getClass();
        printWriter.getClass();
        th.printStackTrace(printWriter);
    }

    public static String stackTraceToString(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    private static final void printStackTrace(Throwable th) {
        th.getClass();
        th.printStackTrace();
    }

    private static final void printStackTrace(Throwable th, PrintStream printStream) {
        th.getClass();
        printStream.getClass();
        th.printStackTrace(printStream);
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }
}
