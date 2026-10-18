package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d<T> implements i<T> {
    private final Collection<? extends i<T>> b;

    @SafeVarargs
    public d(i<T>... iVarArr) {
        if (iVarArr.length != 0) {
            this.b = Arrays.asList(iVarArr);
        } else {
            b0.i("MultiTransformation must contain at least one Transformation");
            throw null;
        }
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

    @Override // com.bumptech.glide.load.i
    public s<T> transform(Context context, s<T> sVar, int i, int i2) {
        Iterator<? extends i<T>> it = this.b.iterator();
        s<T> sVar2 = sVar;
        while (it.hasNext()) {
            s<T> sVarTransform = it.next().transform(context, sVar2, i, i2);
            if (sVar2 != null && !sVar2.equals(sVar) && !sVar2.equals(sVarTransform)) {
                sVar2.recycle();
            }
            sVar2 = sVarTransform;
        }
        return sVar2;
    }

    @Override // com.bumptech.glide.load.i, com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator<? extends i<T>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }

    public d(Collection<? extends i<T>> collection) {
        if (!collection.isEmpty()) {
            this.b = collection;
        } else {
            b0.i("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }
}
