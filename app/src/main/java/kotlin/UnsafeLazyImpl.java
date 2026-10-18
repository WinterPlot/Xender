package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class UnsafeLazyImpl<T> implements j<T>, Serializable {
    private Object _value;
    private kotlin.jvm.functions.a<? extends T> initializer;

    public UnsafeLazyImpl(kotlin.jvm.functions.a<? extends T> aVar) {
        aVar.getClass();
        this.initializer = aVar;
        this._value = v.a;
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
        if (t != v.a) {
            return t;
        }
        kotlin.jvm.functions.a<? extends T> aVar = this.initializer;
        aVar.getClass();
        T tInvoke = aVar.invoke();
        this._value = tInvoke;
        this.initializer = null;
        return tInvoke;
    }

    @Override // kotlin.j
    public boolean isInitialized() {
        return this._value != v.a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
