package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.b<h> {
    private final javax.inject.a<Context> a;
    private final javax.inject.a<com.google.android.datatransport.runtime.time.a> b;
    private final javax.inject.a<com.google.android.datatransport.runtime.time.a> c;

    public i(javax.inject.a<Context> aVar, javax.inject.a<com.google.android.datatransport.runtime.time.a> aVar2, javax.inject.a<com.google.android.datatransport.runtime.time.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static i create(javax.inject.a<Context> aVar, javax.inject.a<com.google.android.datatransport.runtime.time.a> aVar2, javax.inject.a<com.google.android.datatransport.runtime.time.a> aVar3) {
        return new i(aVar, aVar2, aVar3);
    }

    public static h newInstance(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new h(context, aVar, aVar2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.b, javax.inject.a, jakarta.inject.a
    public h get() {
        return newInstance(this.a.get(), this.b.get(), this.c.get());
    }
}
