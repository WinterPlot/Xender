package kotlin.io;

import java.io.Closeable;
import kotlin.jvm.internal.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final void closeFinally(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.e.addSuppressed(th, th2);
            }
        }
    }

    private static final <T extends Closeable, R> R use(T t, kotlin.jvm.functions.l<? super T, ? extends R> lVar) {
        lVar.getClass();
        try {
            R rInvoke = lVar.invoke(t);
            w.finallyStart(1);
            closeFinally(t, null);
            w.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                w.finallyStart(1);
                closeFinally(t, th);
                w.finallyEnd(1);
                throw th2;
            }
        }
    }
}
