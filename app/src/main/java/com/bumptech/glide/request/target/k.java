package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface k<R> extends com.bumptech.glide.manager.l {
    com.bumptech.glide.request.e getRequest();

    void getSize(j jVar);

    @Override // com.bumptech.glide.manager.l
    /* synthetic */ void onDestroy();

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, com.bumptech.glide.request.transition.d<? super R> dVar);

    @Override // com.bumptech.glide.manager.l
    /* synthetic */ void onStart();

    @Override // com.bumptech.glide.manager.l
    /* synthetic */ void onStop();

    void removeCallback(j jVar);

    void setRequest(com.bumptech.glide.request.e eVar);
}
