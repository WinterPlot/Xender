package org.apache.commons.io.function;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
public interface s0<T, U, V, R> {
    <W> s0<T, U, V, W> andThen(t<? super R, ? extends W> tVar);

    R apply(T t, U u, V v) throws IOException;
}
