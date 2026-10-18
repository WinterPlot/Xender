package com.userlabs.xshare.firebase;

import com.google.firebase.provider.FirebaseInitProvider;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class XFirebaseInitProvider extends FirebaseInitProvider {
    @Override // com.google.firebase.provider.FirebaseInitProvider, android.content.ContentProvider
    public boolean onCreate() {
        try {
            return super.onCreate();
        } catch (Throwable unused) {
            return false;
        }
    }
}
