package org.jsoup.internal;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;
import org.apache.commons.io.v;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class m<T> {
    final ThreadLocal<SoftReference<ArrayDeque<T>>> a = new v(new j(1), 2);
    private final Supplier<T> b;

    public m(Supplier<T> supplier) {
        this.b = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SoftReference lambda$new$0() {
        return new SoftReference(new ArrayDeque());
    }

    public T borrow() {
        ArrayDeque<T> stack = getStack();
        return !stack.isEmpty() ? stack.pop() : this.b.get();
    }

    public ArrayDeque<T> getStack() {
        ArrayDeque<T> arrayDeque = this.a.get().get();
        if (arrayDeque != null) {
            return arrayDeque;
        }
        ArrayDeque<T> arrayDeque2 = new ArrayDeque<>();
        this.a.set(new SoftReference<>(arrayDeque2));
        return arrayDeque2;
    }

    public void release(T t) {
        ArrayDeque<T> stack = getStack();
        if (stack.size() < 12) {
            stack.push(t);
        }
    }
}
