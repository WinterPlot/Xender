package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class SafePublicationLazyImpl<T> implements j<T>, Serializable {
    public static final a Companion = new a(null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final Object f5final;
    private volatile kotlin.jvm.functions.a<? extends T> initializer;

    public SafePublicationLazyImpl(kotlin.jvm.functions.a<? extends T> aVar) {
        aVar.getClass();
        this.initializer = aVar;
        v vVar = v.a;
        this._value = vVar;
        this.f5final = vVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.j
    public T getValue() {
        T t = (T) this._value;
        v vVar = v.a;
        if (t != vVar) {
            return t;
        }
        kotlin.jvm.functions.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.initializer = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    @Override // kotlin.j
    public boolean isInitialized() {
        return this._value != v.a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
            this();
        }

        private a() {
        }
    }

    private static /* synthetic */ void getFinal$annotations() {
    }
}
