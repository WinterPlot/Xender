package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class SynchronizedLazyImpl<T> implements j<T>, Serializable {
    private volatile Object _value;
    private kotlin.jvm.functions.a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(kotlin.jvm.functions.a<? extends T> aVar, Object obj) {
        aVar.getClass();
        this.initializer = aVar;
        this._value = v.a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.j
    public T getValue() {
        T tInvoke;
        T t = (T) this._value;
        v vVar = v.a;
        if (t != vVar) {
            return t;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == vVar) {
                kotlin.jvm.functions.a<? extends T> aVar = this.initializer;
                aVar.getClass();
                tInvoke = aVar.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.j
    public boolean isInitialized() {
        return this._value != v.a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(kotlin.jvm.functions.a aVar, Object obj, int i, kotlin.jvm.internal.r rVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
