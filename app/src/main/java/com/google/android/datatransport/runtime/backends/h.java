package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class h {
    private final Context a;
    private final com.google.android.datatransport.runtime.time.a b;
    private final com.google.android.datatransport.runtime.time.a c;

    public h(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
    }

    public g create(String str) {
        return g.create(this.a, this.b, this.c, str);
    }
}
