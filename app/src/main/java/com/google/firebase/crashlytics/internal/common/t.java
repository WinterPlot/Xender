package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements com.google.firebase.crashlytics.internal.breadcrumbs.a {
    public final /* synthetic */ v a;

    public /* synthetic */ t(v vVar) {
        this.a = vVar;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public final void handleBreadcrumb(String str) {
        this.a.log(str);
    }
}
