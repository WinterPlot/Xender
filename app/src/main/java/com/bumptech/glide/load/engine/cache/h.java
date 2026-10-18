package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends com.bumptech.glide.util.h<com.bumptech.glide.load.c, s<?>> implements i {
    private i.a e;

    public h(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.util.h
    public int getSize(s<?> sVar) {
        return sVar == null ? super.getSize((Object) null) : sVar.getSize();
    }

    @Override // com.bumptech.glide.util.h
    public void onItemEvicted(com.bumptech.glide.load.c cVar, s<?> sVar) {
        i.a aVar = this.e;
        if (aVar == null || sVar == null) {
            return;
        }
        aVar.onResourceRemoved(sVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.i
    public /* bridge */ /* synthetic */ s put(com.bumptech.glide.load.c cVar, s sVar) {
        return (s) super.put(cVar, sVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.i
    public /* bridge */ /* synthetic */ s remove(com.bumptech.glide.load.c cVar) {
        return (s) super.remove(cVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.i
    public void setResourceRemovedListener(i.a aVar) {
        this.e = aVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.i
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }
}
