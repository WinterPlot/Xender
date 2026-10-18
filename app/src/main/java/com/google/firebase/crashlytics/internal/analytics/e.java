package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements a {
    private final com.google.firebase.analytics.connector.a a;

    public e(com.google.firebase.analytics.connector.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void logEvent(String str, Bundle bundle) {
        this.a.logEvent("clx", str, bundle);
    }
}
