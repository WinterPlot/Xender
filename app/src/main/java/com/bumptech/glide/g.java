package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
interface g<T> {
    T load(Bitmap bitmap);

    T load(Drawable drawable);

    T load(Uri uri);

    T load(File file);

    T load(Integer num);

    T load(Object obj);

    T load(String str);

    @Deprecated
    T load(URL url);

    T load(byte[] bArr);
}
