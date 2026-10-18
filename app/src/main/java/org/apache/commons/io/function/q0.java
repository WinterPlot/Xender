package org.apache.commons.io.function;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
public interface q0<T> {
    /* JADX INFO: renamed from: asSupplier */
    Supplier<T> mo2742asSupplier();

    T get() throws IOException;

    T getUnchecked() throws UncheckedIOException;
}
