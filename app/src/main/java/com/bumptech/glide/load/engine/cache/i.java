package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onResourceRemoved(s<?> sVar);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    s<?> put(com.bumptech.glide.load.c cVar, s<?> sVar);

    s<?> remove(com.bumptech.glide.load.c cVar);

    void setResourceRemovedListener(a aVar);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
