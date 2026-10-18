package com.google.firebase.crashlytics;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements com.google.firebase.crashlytics.internal.breadcrumbs.b, com.google.firebase.crashlytics.internal.analytics.a, com.google.firebase.inject.a.InterfaceC0638a {
    public final /* synthetic */ b a;

    public /* synthetic */ a(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.firebase.inject.a.InterfaceC0638a
    public void handle(com.google.firebase.inject.b bVar) {
        this.a.lambda$init$2(bVar);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void logEvent(String str, Bundle bundle) {
        this.a.lambda$getAnalyticsEventLogger$1(str, bundle);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.b
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.a aVar) {
        this.a.lambda$getDeferredBreadcrumbSource$0(aVar);
    }
}
