package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.i;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c<T> implements i<T> {
    private static final i<?> b = new c();

    private c() {
    }

    public static <T> c<T> get() {
        return (c) b;
    }

    @Override // com.bumptech.glide.load.i, com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.i
    public s<T> transform(Context context, s<T> sVar, int i, int i2) {
        return sVar;
    }
}
