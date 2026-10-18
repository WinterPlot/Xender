package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.c;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final <T> T getOrDefault(c cVar, c.a<T> aVar, T t) {
        cVar.getClass();
        aVar.getClass();
        T t2 = (T) cVar.get(aVar);
        return t2 == null ? t : t2;
    }
}
