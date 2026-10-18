package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements com.google.android.datatransport.runtime.retries.a {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.datatransport.runtime.retries.a
    public final Object apply(Object obj) {
        return this.a.doSend((d.a) obj);
    }
}
