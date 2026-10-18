package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c implements com.bumptech.glide.load.c {
    private final com.bumptech.glide.load.c b;
    private final com.bumptech.glide.load.c c;

    public c(com.bumptech.glide.load.c cVar, com.bumptech.glide.load.c cVar2) {
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.b.equals(cVar.b) && this.c.equals(cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public com.bumptech.glide.load.c getSourceKey() {
        return this.b;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }

    @Override // com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
    }
}
