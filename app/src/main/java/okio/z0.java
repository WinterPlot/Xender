package okio;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z0 {
    public static final byte[] asUtf8ToByteArray(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kotlin.text.f.b);
        bytes.getClass();
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, kotlin.text.f.b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, kotlin.jvm.functions.a<? extends T> aVar) {
        reentrantLock.getClass();
        aVar.getClass();
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.w.finallyStart(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.w.finallyEnd(1);
        }
    }
}
