package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private final kotlin.jvm.functions.a<y> a;
    private final AtomicInteger b;
    private final AtomicBoolean c;

    public a(kotlin.jvm.functions.a<y> aVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    private final boolean isClosed() {
        return this.c.get();
    }

    public final boolean block$room_runtime() {
        synchronized (this) {
            if (isClosed()) {
                return false;
            }
            this.b.incrementAndGet();
            return true;
        }
    }

    public final void close$room_runtime() {
        synchronized (this) {
            if (this.c.compareAndSet(false, true)) {
                y yVar = y.a;
                while (this.b.get() != 0) {
                }
                this.a.invoke();
            }
        }
    }

    public final void unblock$room_runtime() {
        synchronized (this) {
            this.b.decrementAndGet();
            if (this.b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            y yVar = y.a;
        }
    }
}
