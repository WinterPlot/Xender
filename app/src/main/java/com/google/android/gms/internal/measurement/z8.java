package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class z8 {
    private static volatile z8 b;
    private final List a = new CopyOnWriteArrayList();

    private z8() {
    }

    public static z8 zza() {
        if (b == null) {
            synchronized (z8.class) {
                try {
                    if (b == null) {
                        b = new z8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final void zzb(y8 y8Var) {
        this.a.add(0, y8Var);
    }
}
