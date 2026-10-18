package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, kotlin.jvm.functions.p<? super AtomicReference<T>, ? super T, kotlin.y> pVar) {
        while (true) {
            pVar.invoke(atomicReference, (Object) getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }
}
