package androidx.collection.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void checkPrecondition(boolean z, kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (z) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final void requirePrecondition(boolean z, kotlin.jvm.functions.a<String> aVar) {
        aVar.getClass();
        if (z) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        str.getClass();
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        str.getClass();
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        str.getClass();
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }

    public static final Void throwNoSuchElementExceptionForInline(String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }
}
