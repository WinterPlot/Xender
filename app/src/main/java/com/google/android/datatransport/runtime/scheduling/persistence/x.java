package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements com.google.android.datatransport.runtime.dagger.internal.b<w> {
    private final javax.inject.a<Context> a;
    private final javax.inject.a<String> b;
    private final javax.inject.a<Integer> c;

    public x(javax.inject.a<Context> aVar, javax.inject.a<String> aVar2, javax.inject.a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static x create(javax.inject.a<Context> aVar, javax.inject.a<String> aVar2, javax.inject.a<Integer> aVar3) {
        return new x(aVar, aVar2, aVar3);
    }

    public static w newInstance(Context context, String str, int i) {
        return new w(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.b, javax.inject.a, jakarta.inject.a
    public w get() {
        return newInstance(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
