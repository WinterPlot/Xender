package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements com.google.firebase.installations.internal.a {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    @Override // com.google.firebase.installations.internal.a
    public final void onFidChanged(String str) {
        this.a.lambda$new$2(str);
    }
}
