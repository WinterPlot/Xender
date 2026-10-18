package com.bumptech.glide.load;

import androidx.collection.q0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements c {
    private final androidx.collection.a<e<?>, Object> b = new com.bumptech.glide.util.b();

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    public <T> T get(e<T> eVar) {
        return this.b.containsKey(eVar) ? (T) this.b.get(eVar) : eVar.getDefaultValue();
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.b.hashCode();
    }

    public void putAll(f fVar) {
        this.b.putAll((q0<? extends e<?>, ? extends Object>) fVar.b);
    }

    public f remove(e<?> eVar) {
        this.b.remove(eVar);
        return this;
    }

    public <T> f set(e<T> eVar, T t) {
        this.b.put(eVar, t);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.b + '}';
    }

    @Override // com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            updateDiskCacheKey(this.b.keyAt(i), this.b.valueAt(i), messageDigest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void updateDiskCacheKey(e<T> eVar, Object obj, MessageDigest messageDigest) {
        eVar.update(obj, messageDigest);
    }
}
