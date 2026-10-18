package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface i<T> extends c {
    s<T> transform(Context context, s<T> sVar, int i, int i2);

    @Override // com.bumptech.glide.load.c
    /* synthetic */ void updateDiskCacheKey(MessageDigest messageDigest);
}
