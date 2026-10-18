package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.s;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface h<T> extends a<s<T>> {
    @Override // com.bumptech.glide.load.a
    /* synthetic */ boolean encode(Object obj, File file, f fVar);

    EncodeStrategy getEncodeStrategy(f fVar);
}
