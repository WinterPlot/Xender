package com.userlabs.xshare.fastdownloader.main;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    void onCanceled(com.userlabs.xshare.fastdownloader.model.b bVar);

    void onCompleted(com.userlabs.xshare.fastdownloader.model.b bVar);

    void onDownloading(com.userlabs.xshare.fastdownloader.model.b bVar);

    void onError(com.userlabs.xshare.fastdownloader.model.b bVar, Throwable th);

    void onStart(com.userlabs.xshare.fastdownloader.model.b bVar);
}
