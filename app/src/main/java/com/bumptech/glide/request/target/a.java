package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a<Z> implements k<Z> {
    private com.bumptech.glide.request.e a;

    @Override // com.bumptech.glide.request.target.k
    public com.bumptech.glide.request.e getRequest() {
        return this.a;
    }

    @Override // com.bumptech.glide.request.target.k
    public abstract /* synthetic */ void getSize(j jVar);

    @Override // com.bumptech.glide.request.target.k
    public abstract /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.d dVar);

    @Override // com.bumptech.glide.request.target.k
    public abstract /* synthetic */ void removeCallback(j jVar);

    @Override // com.bumptech.glide.request.target.k
    public void setRequest(com.bumptech.glide.request.e eVar) {
        this.a = eVar;
    }

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    public void onStart() {
    }

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.k
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.k
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.k
    public void onLoadStarted(Drawable drawable) {
    }
}
