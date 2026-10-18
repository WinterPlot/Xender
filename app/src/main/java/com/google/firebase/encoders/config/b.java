package com.google.firebase.encoders.config;

import com.google.firebase.encoders.config.b;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.f;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface b<T extends b<T>> {
    <U> T registerEncoder(Class<U> cls, d<? super U> dVar);

    <U> T registerEncoder(Class<U> cls, f<? super U> fVar);
}
