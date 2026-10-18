package com.google.android.play.core.hsdp.service;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
class v implements a.b {
    private final a.b a;

    public v(a.b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onAffordanceEnded() {
        this.a.onAffordanceEnded();
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onAffordanceStarted() {
        this.a.onAffordanceStarted();
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onDeepLinkStarted() {
        this.a.onDeepLinkStarted();
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onDismissed(Bundle bundle) {
        this.a.onDismissed(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onError(Bundle bundle) {
        this.a.onError(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.a.b
    public void onShown(Bundle bundle) {
        this.a.onShown(bundle);
    }
}
