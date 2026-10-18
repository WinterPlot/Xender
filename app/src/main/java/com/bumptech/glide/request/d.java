package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.k;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface d<R> extends Future<R>, k<R> {
    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ e getRequest();

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void getSize(com.bumptech.glide.request.target.j jVar);

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    /* synthetic */ void onDestroy();

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void onLoadCleared(Drawable drawable);

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void onLoadFailed(Drawable drawable);

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void onLoadStarted(Drawable drawable);

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.d dVar);

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    /* synthetic */ void onStart();

    @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.manager.l
    /* synthetic */ void onStop();

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void removeCallback(com.bumptech.glide.request.target.j jVar);

    @Override // com.bumptech.glide.request.target.k
    /* synthetic */ void setRequest(e eVar);
}
