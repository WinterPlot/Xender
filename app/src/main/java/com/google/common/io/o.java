package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Closeable {
    private static final a d = new n();
    final a a;
    private final Deque<Closeable> b = new ArrayDeque(4);
    private Throwable c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    public o(a aVar) {
        this.a = (a) com.google.common.base.m.checkNotNull(aVar);
    }

    public static o create() {
        return new o(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            th.addSuppressed(th2);
        } catch (Throwable unused) {
            m.a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.c;
        while (!this.b.isEmpty()) {
            Closeable closeableRemoveFirst = this.b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    ((n) this.a).getClass();
                    lambda$static$0(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.c != null || th == null) {
            return;
        }
        com.google.common.base.v.throwIfInstanceOf(th, IOException.class);
        com.google.common.base.v.throwIfUnchecked(th);
        b0.o(th);
    }

    public <C extends Closeable> C register(C c) {
        if (c != null) {
            this.b.addFirst(c);
        }
        return c;
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th, Class<X1> cls, Class<X2> cls2) throws Exception {
        com.google.common.base.m.checkNotNull(th);
        this.c = th;
        com.google.common.base.v.throwIfInstanceOf(th, IOException.class);
        com.google.common.base.v.throwIfInstanceOf(th, cls);
        com.google.common.base.v.throwIfInstanceOf(th, cls2);
        com.google.common.base.v.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th, Class<X> cls) throws Exception {
        com.google.common.base.m.checkNotNull(th);
        this.c = th;
        com.google.common.base.v.throwIfInstanceOf(th, IOException.class);
        com.google.common.base.v.throwIfInstanceOf(th, cls);
        com.google.common.base.v.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    public RuntimeException rethrow(Throwable th) throws Throwable {
        com.google.common.base.m.checkNotNull(th);
        this.c = th;
        com.google.common.base.v.throwIfInstanceOf(th, IOException.class);
        com.google.common.base.v.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }
}
