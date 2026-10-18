package org.apache.commons.io.function;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
public interface t<T, R> {
    p<T> andThen(Consumer<? super R> consumer);

    p<T> andThen(p<? super R> pVar);

    <V> t<T, V> andThen(Function<? super R, ? extends V> function);

    /* JADX INFO: renamed from: andThen */
    <V> t<T, V> mo1068andThen(t<? super R, ? extends V> tVar);

    R apply(T t) throws IOException;

    Function<T, R> asFunction();

    q0<R> compose(Supplier<? extends T> supplier);

    q0<R> compose(q0<? extends T> q0Var);

    <V> t<V, R> compose(Function<? super V, ? extends T> function);

    <V> t<V, R> compose(t<? super V, ? extends T> tVar);
}
