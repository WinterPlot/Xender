package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.s;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface g<T, Z> {
    s<Z> decode(T t, int i, int i2, f fVar) throws IOException;

    boolean handles(T t, f fVar) throws IOException;
}
