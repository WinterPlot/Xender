package com.google.firebase.events;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    <T> void subscribe(Class<T> cls, b<? super T> bVar);

    <T> void subscribe(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void unsubscribe(Class<T> cls, b<? super T> bVar);
}
