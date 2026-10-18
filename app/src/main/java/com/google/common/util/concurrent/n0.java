package com.google.common.util.concurrent;

import java.lang.Throwable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class n0<T extends Throwable> {
    private n0() {
    }

    public static Error sneakyThrow(Throwable th) {
        throw new n0().throwIt(th);
    }

    private Error throwIt(Throwable th) throws Throwable {
        throw th;
    }
}
