package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ com.google.android.gms.tasks.k c;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, com.google.android.gms.tasks.k kVar, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        com.google.android.gms.tasks.k kVar = this.c;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                firebaseMessaging.lambda$deleteToken$11(kVar);
                break;
            case 1:
                firebaseMessaging.lambda$register$9(kVar);
                break;
            default:
                firebaseMessaging.lambda$getToken$8(kVar);
                break;
        }
    }
}
