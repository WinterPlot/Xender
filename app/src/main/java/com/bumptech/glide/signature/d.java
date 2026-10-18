package com.bumptech.glide.signature;

import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements com.bumptech.glide.load.c {
    private final Object b;

    public d(Object obj) {
        this.b = k.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.b.equals(((d) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }

    @Override // com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(com.bumptech.glide.load.c.a));
    }
}
