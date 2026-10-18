package org.apache.commons.io.function;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
public interface z {
    LongSupplier asSupplier();

    long getAsLong() throws IOException;
}
